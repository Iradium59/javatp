package cda.java.exercices.tp4TU;

import cda.java.exercices.tp4TU.LegacyCode.GildedRose;
import cda.java.exercices.tp4TU.LegacyCode.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldenMasterTest {

    @Test
    public void testGoldenMaster() {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Conjured Mana Cake", 3, 6)
        };

        GildedRose gildedRose = new GildedRose(items);
        int days = 2;
        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality();
        }

        assertEquals(expectedOutputAfter2Days(), actualOutputAfter2Days(items));
    }

    private String expectedOutputAfter2Days() {
        return  "+5 Dexterity Vest, 8, 18\n" +
                "Aged Brie, 0, 2\n" +
                "Elixir of the Mongoose, 3, 5\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 13, 22\n" +
                "Backstage passes to a TAFKAL80ETC concert, 8, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 3, 50\n" +
                "Conjured Mana Cake, 1, 4\n";
    }

    private String actualOutputAfter2Days(Item[] items) {
        StringBuilder result = new StringBuilder();
        for (Item item : items) {
            result.append(item.toString()).append("\n");
        }
        return result.toString();
    }

    @Test
    public void testAfterRefactoring() {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                // ... (ajoutez d'autres items)
        };

        GildedRose refactoredGildedRose = new GildedRose(items);
        refactoredGildedRose.updateQuality();

        // Utilisez la méthode pour comparer les résultats
        compareResultsWithLegacy(items);
    }

    private void compareResultsWithLegacy(Item[] items) {
        GildedRose legacyGildedRose = new GildedRose(items.clone());
        GildedRose refactoredGildedRose = new GildedRose(items);

        legacyGildedRose.updateQuality();
        refactoredGildedRose.updateQuality();

        for (int i = 0; i < items.length; i++) {
            assertEquals(legacyGildedRose.items[i].quality, refactoredGildedRose.items[i].quality);
            assertEquals(legacyGildedRose.items[i].sellIn, refactoredGildedRose.items[i].sellIn);
        }
    }
}