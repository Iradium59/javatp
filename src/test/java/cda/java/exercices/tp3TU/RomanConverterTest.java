package cda.java.exercices.tp3TU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import cda.java.exercices.tp3TU.RomanConverter;
public class RomanConverterTest {

    @Test
    public void testConvertToRoman_WithOne_ShouldReturnI() {
        // Arrange
        int arabicNumber = 1;

        // Act
        String result = RomanConverter.convertToRoman(arabicNumber);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvertToRoman_WithInvalidNumber_ShouldThrowException() {
        // Arrange
        int invalidNumber = 0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.convertToRoman(invalidNumber);
        });
    }

    @Test
    public void testConvertToRoman_WithNumberGreaterThan3000_ShouldThrowException() {
        // Arrange
        int invalidNumber = 4000;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.convertToRoman(invalidNumber);
        });
    }

    @Test
    public void testConvertToRoman_WithNonIntegerNumber_ShouldThrowException() {
        // Arrange
        double invalidNumber = 10.5;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.convertToRoman((int) invalidNumber);
        });
    }

    @Test
    public void testConvertToRoman_WithNegativeNumber_ShouldThrowException() {
        // Arrange
        int invalidNumber = -5;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.convertToRoman(invalidNumber);
        });
    }

    @Test
    public void testConvertToRoman_WithInvalidInput_ShouldThrowException() {
        // Arrange
        String invalidInput = "abc";

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.convertToRoman(Integer.parseInt(invalidInput));
        });
    }
}
