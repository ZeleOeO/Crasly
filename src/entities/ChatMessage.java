package entities;

import tools.IDGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ChatMessage {
    private final long id;
    private final User sender;
    private final Chat chat;
    private final Text text;
    private List<ChatMessage> replies;  // List to hold multiple replies
    private List<Reaction> reactions;
    private final String sentAt;

    public ChatMessage(Chat chat, Text text, User sender) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.id = IDGenerator.generateIDForChatMessage();
        this.text = text;
        this.chat = chat;
        this.sender = sender;
        this.replies = new ArrayList<>();  // Initialize the list of replies
        this.reactions = new ArrayList<>();
        this.sentAt = LocalDateTime.now().format(formatter);
        chat.addChatMessage(this);
    }

    // Method to add a reply to this message
    public void addReply(ChatMessage replyMessage) {
        this.replies.add(replyMessage);  // Add the reply to the list
    }

    // Getter and Setter methods
    public long getId() {
        return id;
    }

    public User getSender() {
        return sender;
    }

    public Chat getChat() {
        return chat;
    }

    public Text getText() {
        return text;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public String getSentAt() {
        return sentAt;
    }

    public List<ChatMessage> getReplies() {
        return replies;  // Return the list of replies
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }
}
