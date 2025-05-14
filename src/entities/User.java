package entities;

import tools.IDGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private long id;
    private String username;
    private List<Chat> chats;

    public User(String username) {
        this.id = IDGenerator.generateIDForUser();
        this.username = username;
        this.chats = new ArrayList<>();
    }

    public ChatMessage sendTextMessage(Chat chat, String content) {
        Text text = new Text(content);
        return new ChatMessage(chat, text, this);
    }

    public ChatMessage reactToChatMessage(Reaction reaction, ChatMessage message ) {
        message.getReactions().add(reaction);
        return message;
    }

    public ChatMessage replyToChatMessage(ChatMessage message, String content) {
        ChatMessage reply = new ChatMessage(message.getChat(), new Text(content), this);
        message.getReplies().add(reply);
        return reply;
    }

    // Getter And Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }
}
