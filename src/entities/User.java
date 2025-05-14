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
