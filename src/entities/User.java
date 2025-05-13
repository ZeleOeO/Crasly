package entities;

import tools.IDGenerator;

public class User {
    private long id;
    private String username;
    Text text;

    public User(String username) {
        this.id = IDGenerator.generateIDForUser();
        this.username = username;
    }


    public Text sendText(String message, Chat chat) {
        this.text = new Text(this, message, chat);
        chat.getHistory().add(new ChatMessage(this, this.getText()));
        return text;
    }

    public Text reactChat(Chat chat, Long chatMessageId, Reaction reaction) {
        Text text = chat.getChatMessageByID(chatMessageId).getText();
        text.setReaction(reaction);
        return text;
    }

    //Getters And Setters
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

    public Text getText() {
        return text;
    }
}
