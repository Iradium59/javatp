package cda.java.exercices.tp2TU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import cda.java.exercices.tp2TU.Adresse;
class AdresseTest {
    @Test
    void testConstructionAdresse() {
        Adresse adresse = new Adresse("Rue des Lilas", "5B", "12345", "Villeville", "Paysland");
        assertEquals("Rue des Lilas", adresse.getVoie());
        assertEquals("5B", adresse.getRue());
        assertEquals("12345", adresse.getCp());
        assertEquals("Villeville", adresse.getVille());
        assertEquals("Paysland", adresse.getPays());
    }
}
