package cda.java.exercices.tp4TU;

import cda.java.exercices.tp4TU.GildedRose;
import cda.java.exercices.tp4TU.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldenMasterTest {

    @Test
    public void testGoldenMaster() {
        // Créez vos items initiaux comme dans le Main.java
        Item[] items = new Item[] {
                // ... (les mêmes items que dans le Main.java)
        };

        // Créez une instance de GildedRose avec ces items
        GildedRose gildedRose = new GildedRose(items);

        // Exécutez la mise à jour de la qualité pour un certain nombre de jours
        int days = 2;
        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality();
        }

        // Comparez les résultats avec les résultats du Main.java
        assertEquals(expectedOutputAfter2Days(), actualOutputAfter2Days(items));
    }

    private String expectedOutputAfter2Days() {
        // Retournez la sortie attendue après 2 jours comme une chaîne de caractères
        return "EXPECTED_OUTPUT";
    }

    private String actualOutputAfter2Days(Item[] items) {
        // Retournez la sortie réelle après 2 jours comme une chaîne de caractères
        StringBuilder result = new StringBuilder();
        for (Item item : items) {
            result.append(item.toString()).append("\n");
        }
        return result.toString();
    }
}