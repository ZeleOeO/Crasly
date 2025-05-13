package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Admin {
    private static List<Long> allUsers = new ArrayList<>();
    private static List<Long> allChat = new ArrayList<>();
    private static List<Long> allText = new ArrayList<>();
    private static List<Long> allMessagesInAChat = new ArrayList<>();

    static public List<Long> getAllUsers() {
        return allUsers;
    }

    static public List<Long> getAllChat() {
        return allChat;
    }

    static public List<Long> getAllText() {
        return allText;
    }

    static public List<Long> getAllMessagesInAChat() {
        return allMessagesInAChat;
    }

    public static void setAllUsers(List<Long> allUsers) {
        Admin.allUsers = allUsers;
    }

    public static void setAllChat(List<Long> allChat) {
        Admin.allChat = allChat;
    }

    public static void setAllText(List<Long> allText) {
        Admin.allText = allText;
    }

    public static void setAllMessagesInAChat(List<Long> allMessagesInAChat) {
        Admin.allMessagesInAChat = allMessagesInAChat;
    }
}
