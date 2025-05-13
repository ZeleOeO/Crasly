package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

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
        assertEquals(1, chat.getHistory().size());

        assertEquals("test mESSAGE", chat.getHistory().stream().filter(chatMessage -> Objects.equals(chatMessage.getUser().getId(), user.getId())).findFirst().get().getText().getMessage());
        assertEquals("test mESSAGE", chat.getHistory().stream().map(chatMessage -> chatMessage.getUser().getText().getMessage()).findFirst().orElse(null));

        other.sendText("other mESSAGE", chat);
        assertNotNull(other.getText());
        assertEquals("other mESSAGE", other.getText().getMessage());
        assertEquals(2, chat.getHistory().size());
        assertEquals("other mESSAGE", chat.getHistory().stream().filter(chatMessage -> Objects.equals(chatMessage.getUser().getId(), other.getId())).findFirst().get().getText().getMessage());
    }

    @Test
    void testReactionText() {
        other.sendText("test mESSAGE", chat);
        other.sendText("other mESSAGE", chat);
        ChatMessage chatMessage = chat.getChatMessageByUserId(other.getId());
        Text text = user.reactChat(chat, chatMessage.getId(), Reaction.NEUTRAL);
        assertNotNull(text);
        assertEquals("other mESSAGE", text.getMessage());
        assertEquals(2, chat.getHistory().size());
        assertEquals(Reaction.NEUTRAL, text.getReaction());
    }

    @Test
    void findUserByIdInHistory() {
        User user = new User("test") ;
        user.sendText("test mESSAGE", chat);
        User newuser = chat.getHistory().stream().filter(chatMessage -> Objects.equals(chatMessage.getUser().getId(), user.getId())).findFirst().get().getUser();
        assertNotNull(newuser);
        assertEquals("test mESSAGE", newuser.getText().getMessage());
        assertEquals(1, chat.getHistory().size());

    }
}