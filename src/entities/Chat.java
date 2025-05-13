package entities;

import tools.IDGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Chat {
    private long id;
    private User user1;
    private User user2;
    private String name;
    private List<ChatMessage> history;

    public Chat() {}
    public Chat(User user1, User user2) {
        this.id = IDGenerator.generateIDForChat();
        this.user1 = user1;
        this.user2 = user2;
        this.name = user1.getUsername() + " and " + user2.getUsername();
        this.history = new ArrayList<>();
    }

    public User getUserById(long id) {
        return this.getHistory()
                .stream()
                .filter(chatMessage -> Objects.equals(chatMessage.getUser().getId(), id))
                .findFirst()
                .get().getUser();
    }

    public long getId() {
        return id;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChatMessage> getHistory() {
        return this.history;
    }
}
