package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

class TextTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testTextCreation() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        User sender = new User("sender");
        User receiver = new User("receiver");
        Chat chat = new Chat(sender, receiver);
        Text text = new Text(sender, "Hello", chat);

        assertNotNull(text);
        assertEquals(sender, text.getSender());
        assertEquals("Hello", text.getMessage());
        assertEquals(chat, text.getChat());
        assertEquals(LocalDateTime.now().format(formatter), text.getSentAt());
    }

}