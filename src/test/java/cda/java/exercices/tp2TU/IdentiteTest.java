package cda.java.tp2TU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import cda.java.exercices.tp2TU.Identite;
class IdentiteTest {

    @Test
    void testGetNom() {
        Identite identite = new Identite("Dupont", "Jean", null);
        assertEquals("Dupont", identite.getNom());
    }

    @Test
    void testGetPrenom() {
        Identite identite = new Identite("Dupont", "Jean", null);
        assertEquals("Jean", identite.getPrenom());
    }

}

