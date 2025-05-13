package entities;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private static List<Long> allUsers = new ArrayList<>();
    private static List<Long> allChat = new ArrayList<>();
    private static List<Long> allText = new ArrayList<>();

    static public List<Long> getAllUsers() {
        return allUsers;
    }

    static public List<Long> getAllChat() {
        return allChat;
    }

    static public List<Long> getAllText() {
        return allText;
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
}
