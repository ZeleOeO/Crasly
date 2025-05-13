package entities;

import tools.IDGenerator;

public class ChatMessage {
    private final long id;
    private User user;
    private Text text;

    public ChatMessage(User user, Text text) {
        this.id = IDGenerator.generateIDForChatMessage();
        this.user = user;
        this.text = text;
    }

    public User getUser() {
        return this.user;
    }

    public long getId() {
        return id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
