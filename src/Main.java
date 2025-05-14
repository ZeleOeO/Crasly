import entities.Chat;
import entities.ChatMessage;
import entities.Reaction;
import entities.User;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat("J Guys");
        User user = new User("John");
        User user2 = new User("Jane");
        User user3 = new User("Jack");
        chat.addUserToChat(user);
        chat.addUserToChat(user2);
        var text = user.sendTextMessage(chat, "Hello World!");
        var text2 = user2.replyToChatMessage(text, "Hello To You Too!");
        user2.reactToChatMessage(Reaction.NEUTRAL, text);
        chat.addUserToChat(user3);
        user3.reactToChatMessage(Reaction.FUNNY, text);
        var text3 = user3.replyToChatMessage(text, "What are you saying hello world to");
        text3 = user3.sendTextMessage(chat, "What's with all these hello worlds");
        chat.printChatHistory();
    }
}
