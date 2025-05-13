package tools;

import entities.Admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IDGeneratorTest {
    @BeforeEach
    void setUp() {
        Admin.setAllText(new ArrayList<Long>());
    }

    @Test
    void testTextId_Unique() {
        List<Long> ids = new ArrayList<Long>();
        for (int i = 0; i < 50; i++) {
            Long textId = IDGenerator.generateIDForText();
            assertNotNull(textId);
            assertFalse(ids.contains(textId));
            ids.add(textId);
        }
    }
    @Test
    void testTextId_AddedToAdminsList() {
        Long textId = IDGenerator.generateIDForText();
        assertNotNull(textId);
        assertTrue(Admin.getAllText().contains(textId));
    }

    @Test
    void testUserId_AddedToAdminsList() {
        Long userId = IDGenerator.generateIDForUser();
        assertNotNull(userId);
        assertTrue(Admin.getAllUsers().contains(userId));
    }

    @Test
    void testChatId_AddedToAdminsList() {
        Long chatId = IDGenerator.generateIDForChat();
        assertNotNull(chatId);
        assertTrue(Admin.getAllChat().contains(chatId));
    }

    @Test
    void testTextId_IsPositive() {
        for (int i = 0; i < 50; i++) {
            Long textId = IDGenerator.generateIDForText();
            assertNotNull(textId);
            assertTrue(textId > 0);
        }
    }
}
