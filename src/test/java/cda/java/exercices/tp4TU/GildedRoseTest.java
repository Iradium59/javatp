package cda.java.exercices.tp4TU;

import cda.java.exercices.tp4TU.GildedRose;
import cda.java.exercices.tp4TU.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    public void testUpdateQualityForNormalItem() {
        Item[] items = new Item[]{new Item("Normal Item", 5, 10)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(9, items[0].quality);
    }

    @Test
    public void testUpdateQualityForAgedBrie() {
        Item[] items = new Item[]{new Item("Aged Brie", 5, 10)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(11, items[0].quality);
    }

    @Test
    public void testUpdateQualityForConjuredItem() {
        Item[] items = new Item[]{new Item("Conjured Item", 5, 10)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(8, items[0].quality);
    }

    @Test
    public void testUpdateQualityForBackstagePasses() {
        Item[] items = new Item[]{new Item("Backstage passes", 15, 20)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(14, items[0].sellIn);
        assertEquals(21, items[0].quality);
    }

    @Test
    public void testUpdateQualityForSulfuras() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }

    @Test
    public void testUpdateQualityForExpiredItem() {
        Item[] items = new Item[]{new Item("Expired Item", -1, 10)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(-2, items[0].sellIn);
        assertEquals(8, items[0].quality);
    }

    @Test
    public void testUpdateQualityForMaxQuality() {
        Item[] items = new Item[]{new Item("Max Quality Item", 5, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(50, items[0].quality);
    }

    // Ajoutez d'autres tests pour couvrir d'autres cas et comportements particuliers
    // ...
}
