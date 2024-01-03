package cda.java.exercices.tp4TU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {
    @Test
    public void testUpdateQualityForRegularItem() {
        Item regularItem = new Item("Regular Item", 5, 10);
        GildedRose app = new GildedRose(new Item[]{regularItem});
        app.updateQuality();
        assertEquals(9, regularItem.quality);
        assertEquals(4, regularItem.sellIn);
    }

    @Test
    public void testUpdateQualityForAgedBrie() {
        Item agedBrie = new Item("Aged Brie", 3, 20);
        GildedRose app = new GildedRose(new Item[]{agedBrie});
        app.updateQuality();
        assertEquals(21, agedBrie.quality);
        assertEquals(2, agedBrie.sellIn);
    }

    @Test
    public void testUpdateQualityForBackstagePasses() {
        Item backstagePass = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 30);
        GildedRose app = new GildedRose(new Item[]{backstagePass});
        app.updateQuality();
        assertEquals(32, backstagePass.quality);
        assertEquals(7, backstagePass.sellIn);
    }

    @Test
    public void testUpdateQualityForSulfuras() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        GildedRose app = new GildedRose(new Item[]{sulfuras});
        app.updateQuality();
        assertEquals(80, sulfuras.quality);
        assertEquals(0, sulfuras.sellIn);
    }

    @Test
    public void testUpdateQualityMultipleDays() {
        Item regularItem = new Item("Regular Item", 5, 10);
        GildedRose app = new GildedRose(new Item[]{regularItem});

        int days = 3;
        for (int i = 0; i < days; i++) {
            app.updateQuality();
        }

        assertEquals(7, regularItem.quality);
        assertEquals(2, regularItem.sellIn);
    }

    @Test
    public void testUpdateQualityForConjuredItem() {
        Item conjuredItem = new Item("Conjured Mana Cake", 3, 6);
        GildedRose app = new GildedRose(new Item[]{conjuredItem});
        app.updateQuality();
        assertEquals(4, conjuredItem.quality);
        assertEquals(2, conjuredItem.sellIn);
    }

}