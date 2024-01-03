package cda.java.exercices.tp4TU;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItemQuality(item);
        }
    }

    private void updateItemQuality(Item item) {
        if (isRegularItem(item)) {
            updateRegularItem(item);
        } else if (item.name.equals("Aged Brie")) {
            updateAgedBrie(item);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateBackstagePass(item);
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            // No need to update Sulfuras
        } else if (item.name.equals("Conjured Mana Cake")) {
            updateConjuredItem(item);
        }
    }

    private void updateRegularItem(Item item) {
        decreaseQuality(item);
        decreaseSellIn(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void updateAgedBrie(Item item) {
        increaseQuality(item);
        decreaseSellIn(item);
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }

    private void updateBackstagePass(Item item) {
        increaseQuality(item);
        if (item.sellIn < 11) {
            increaseQuality(item);
        }
        if (item.sellIn < 6) {
            increaseQuality(item);
        }
        decreaseSellIn(item);
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void updateConjuredItem(Item item) {
        decreaseQuality(item);
        decreaseQuality(item); // Conjured items degrade in quality twice as fast
        decreaseSellIn(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
            decreaseQuality(item);
        }
    }

    private boolean isRegularItem(Item item) {
        return !item.name.equals("Aged Brie") &&
                !item.name.equals("Backstage passes to a TAFKAL80ETC concert") &&
                !item.name.equals("Sulfuras, Hand of Ragnaros") &&
                !item.name.equals("Conjured Mana Cake");
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void decreaseSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }
    }
}
