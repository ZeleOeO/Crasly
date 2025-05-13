package tools;

import entities.Admin;
import entities.Text;

import java.util.Random;
import java.util.UUID;

public class IDGenerator {
    static public Long generateIDForUser() {
        Random random = new Random();
        Long ids = random.nextLong();
        if (Admin.getAllText().contains(ids) || ids < 0) {
            return generateIDForUser();
        }
        Admin.getAllUsers().add(ids);
        return ids;
    }

    static public Long generateIDForText() {
        Random random = new Random();
        Long ids = random.nextLong();
        if (Admin.getAllText().contains(ids) || ids < 0) {
            return generateIDForText();
        }
        Admin.getAllText().add(ids);
        return ids;
    }

    static public Long generateIDForChat() {
        Random random = new Random();
        Long ids = random.nextLong();
        if (Admin.getAllText().contains(ids) || ids < 0) {
            return generateIDForChat();
        }
        Admin.getAllChat().add(ids);
        return ids;
    }
}
