package entities;

import tools.IDGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatMessage {
    private final long id;
    private User sender;
    private Chat chat;
    private Text text;
    private Reaction reaction;
    private final String sentAt;

    public ChatMessage(Chat chat, Text text, User sender) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.id = IDGenerator.generateIDForChatMessage();
        this.text = text;
        this.chat = chat;
        this.sender = sender;
        this.sentAt = LocalDateTime.now().format(formatter);
    }


    // Getter And Setter
    public long getId() {
        return id;
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

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Reaction getReaction() {
        return reaction;
    }

    public void setReaction(Reaction reaction) {
        this.reaction = reaction;
    }

    public String getSentAt() {
        return sentAt;
    }
}
