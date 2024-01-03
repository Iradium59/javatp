package cda.java.tp2TU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import cda.java.exercices.tp2TU.Salaire;
class SalaireTest {

    @Test
    void testPayer() {
        Salaire salaire = new Salaire(10.0);
        assertEquals(1510.0, salaire.payer(151));
        assertEquals(1760.0, salaire.payer(160));
    }

    @Test
    void testGetTauxHoraire() {
        Salaire salaire = new Salaire(15.0);
        assertEquals(15.0, salaire.getTauxHoraire());
    }
}
