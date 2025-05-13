package entities;

import tools.IDGenerator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Text {
    private final long id;
    private String message;
    private User sender;
    private Chat chat;
    private final String sentAt;
    private Reaction reaction;

    public Text(User sender, String message, Chat chat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.id = IDGenerator.generateIDForText();
        this.message = message;
        this.chat = chat;
        this.sentAt = LocalDateTime.now().format(formatter);
        this.reaction = null;
        this.sender = sender;
    }

    //Getter And Setter
    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getSentAt() {
        return sentAt;
    }

    public Reaction getReaction() {
        return reaction;
    }

    public void setReaction(Reaction reaction) {
        this.reaction = reaction;
    }
}
