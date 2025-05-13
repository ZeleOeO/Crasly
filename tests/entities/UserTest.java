package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private User other;
    private Chat chat;

    @BeforeEach
    void setUp() {
       user = new User("test") ;
       other = new User("other") ;
       chat = new Chat(user, other);
    }

    @Test
    void testUserCreation() {
        assertNotNull(user);
        assertEquals("test", user.getUsername());
        assertNull(user.getText());
        assertTrue(user.getId() > 0);
    }

    @Test
    void testSendText() {
        user.sendText("test mESSAGE", chat);

        assertNotNull(user.getText());
        assertEquals("test mESSAGE", user.getText().getMessage());
        assertEquals(1, chat.getMessages().size());
        assertEquals("test mESSAGE", chat.getMessages().get(user.getId()));

        other.sendText("other mESSAGE", chat);
        assertNotNull(other.getText());
        assertEquals("other mESSAGE", other.getText().getMessage());
        assertEquals(2, chat.getMessages().size());
        assertEquals("other mESSAGE", chat.getMessages().get(other.getId()));
    }
}