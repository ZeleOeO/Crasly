package entities;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private static List<Long> allUsersId = new ArrayList<>();
    private static List<Long> allChatId = new ArrayList<>();
    private static List<Long> allTextId = new ArrayList<>();
    private static List<Long> allMessagesInAChatId = new ArrayList<>();

    static public List<Long> getAllUsersId() {
        return allUsersId;
    }

    static public List<Long> getAllChatId() {
        return allChatId;
    }

    static public List<Long> getAllTextId() {
        return allTextId;
    }

    static public List<Long> getAllMessagesInAChatId() {
        return allMessagesInAChatId;
    }

    public static void setAllUsersId(List<Long> allUsersId) {
        Admin.allUsersId = allUsersId;
    }

    public static void setAllChatId(List<Long> allChatId) {
        Admin.allChatId = allChatId;
    }

    public static void setAllTextId(List<Long> allTextId) {
        Admin.allTextId = allTextId;
    }

    public static void setAllMessagesInAChatId(List<Long> allMessagesInAChatId) {
        Admin.allMessagesInAChatId = allMessagesInAChatId;
    }
}
