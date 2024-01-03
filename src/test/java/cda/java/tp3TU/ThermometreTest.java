package cda.java.tp3TU;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cda.java.exercices.tp3TU.Thermometre;
public class ThermometreTest {

    @Test
    public void testTemperatureProcheDeZero() {
        Thermometre thermometre = new Thermometre();
        int[] temperatures = {1, 2, 3};
        assertEquals(1, thermometre.getTemperatureProcheDeZero(temperatures));
    }

    @Test
    public void testTemperatureProcheDeZeroAvecNegatif() {
        Thermometre thermometre = new Thermometre();
        int[] temperatures = {-2, -8, 4, 5};
        assertEquals(-2, thermometre.getTemperatureProcheDeZero(temperatures));
    }
}
