package tools;

import entities.Admin;

import java.util.Random;

public class IDGenerator {
    static public Long generateIDForUser() {
        Random random = new Random();
        Long ids = random.nextLong();
        if (Admin.getAllTextId().contains(ids) || ids < 0) {
            return generateIDForUser();
        }
        Admin.getAllUsersId().add(ids);
        return ids;
    }

    static public Long generateIDForText() {
        Random random = new Random();
        Long ids = random.nextLong();
        if (Admin.getAllTextId().contains(ids) || ids < 0) {
            return generateIDForText();
        }
        Admin.getAllTextId().add(ids);
        return ids;
    }

    static public Long generateIDForChat() {
        Random random = new Random();
        Long ids = random.nextLong();
        if (Admin.getAllTextId().contains(ids) || ids < 0) {
            return generateIDForChat();
        }
        Admin.getAllChatId().add(ids);
        return ids;
    }

    static public Long generateIDForChatMessage() {
        Random random = new Random();
        Long ids = random.nextLong();
        if (Admin.getAllMessagesInAChatId().contains(ids)) {
            return generateIDForChatMessage();
        }
        Admin.getAllMessagesInAChatId().add(ids);
        return ids;
    }
}
