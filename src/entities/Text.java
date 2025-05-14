package entities;

import tools.IDGenerator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Text {
    private final long id;
    private String content;

    public Text(User sender, String message, Chat chat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.id = IDGenerator.generateIDForText();
        this.content = message;
    }

    //Getter And Setter
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
