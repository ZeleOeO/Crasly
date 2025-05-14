package entities;

import exceptions.ChatNotCreated;
import tools.IDGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Chat {
    private final long id;
    private String name;
    private User groupAdmin;
    private List<User> users;
    private List<ChatMessage> history;
    private final String createdAt;

    public Chat(String name) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.name = name;
        this.id = IDGenerator.generateIDForChat();
        this.users = new ArrayList<>();
        this.history = new ArrayList<>();
        this.createdAt = LocalDateTime.now().format(formatter);
    }

    public void addUserToChat(User user) {
        this.users.add(user);
        user.getChats().add(this);
    }

    public void addMultipleUsersToChat(List<User> users) {
        this.users.addAll(users);
    }

    public void setGroupAdmin(User groupAdmin) {
        if (this.getUsers().isEmpty()) {throw new ChatNotCreated("There are no users in this chat");}
        this.getUsers().add(groupAdmin);
    }

    public void addChatMessage(ChatMessage chatMessage) {
        this.history.add(chatMessage);
    }

    public void removeUserFromChat(User user) {
        this.users.remove(user);
        user.getChats().remove(this);
    }

    public void printChatHistory() {
        System.out.println("Chat History: " + this.getName());

        for (ChatMessage message : this.getHistory()) {
            String sender = message.getSender().getUsername();
            String content = message.getText().getContent();
            String timestamp = message.getSentAt();

            System.out.println(sender + ": " + content);
            System.out.println("  🕒 Sent at: " + timestamp);

            if (!message.getReactions().isEmpty()) {
                System.out.print("  ❤️ Reactions: ");
                for (Reaction reaction : message.getReactions()) {
                    System.out.print(reaction + " | ");
                }
                System.out.println();
            }
            if (!message.getReplies().isEmpty()) {
                for (ChatMessage reply : message.getReplies()) {
                    String replySender = reply.getSender().getUsername();
                    String replyContent = reply.getText().getContent();
                    System.out.println("  ↪ " + replySender + ": \"" + replyContent + "\"");
                    System.out.println("    🕒 Sent at: " + reply.getSentAt());
                }
            }
            System.out.println();
        }
    }
    // Getter And Setter
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<ChatMessage> getHistory() {
        return history;
    }

    public void setHistory(List<ChatMessage> history) {
        this.history = history;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public User getGroupAdmin() {
        return groupAdmin;
    }
}
