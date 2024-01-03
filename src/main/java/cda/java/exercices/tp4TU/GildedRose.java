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

    private void decreaseQuality(Item item, int amount) {
        for (int i = 0; i < amount; i++) {
            if (item.quality > 0) {
                item.quality--;
            }
        }
    }

    private void decreaseQuality(Item item) {
        decreaseQuality(item, 1);
    }

    private void decreaseSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }
    }

    private void updateConjuredItem(Item item) {
        decreaseQuality(item, 2);
        decreaseSellIn(item);
        if (item.sellIn < 0) {
            decreaseQuality(item, 2);
        }
    }
}
