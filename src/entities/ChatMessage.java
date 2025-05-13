package entities;

public class ChatMessage {
    private long id;
    private User user;
    private Text text;

    public ChatMessage(User id, Text text) {
        this.user = id;
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
