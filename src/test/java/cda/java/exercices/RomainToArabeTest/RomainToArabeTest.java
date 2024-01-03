package cda.java.RomainToArabeTest;

import org.junit.Test;
import static org.junit.Assert.*;

import cda.java.exercices.RomainToArabe.RomainToArabe;
public class RomainToArabeTest {

    @Test
    public void testEstNombreRomainValideWithValidRomanNumber() {
        assertTrue(RomainToArabe.estNombreRomainValide("XIV"));
    }

    @Test
    public void testEstNombreRomainValideWithInvalidRomanNumber() {
        assertFalse(RomainToArabe.estNombreRomainValide("ABC"));
    }

    @Test
    public void testEstNombreRomainValideWithEmptyString() {
        assertFalse(RomainToArabe.estNombreRomainValide(""));
    }

    @Test
    public void testEstNombreRomainValideWithTooLongString() {
        assertFalse(RomainToArabe.estNombreRomainValide("MMMMMMMMMMMMMMM"));
    }

    @Test
    public void testConvertirRomanEnArabeWithValidRomanNumber() {
        assertEquals(14, RomainToArabe.convertirRomanEnArabe("XIV"));
    }

    @Test
    public void testConvertirRomanEnArabeWithInvalidRomanNumber() {
        assertEquals(0, RomainToArabe.convertirRomanEnArabe("ABC"));
    }

    @Test
    public void testConvertirRomanEnArabeWithEmptyString() {
        assertEquals(0, RomainToArabe.convertirRomanEnArabe(""));
    }

    // Vous pouvez ajouter d'autres tests selon les cas de votre application.

}
