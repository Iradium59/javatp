package cda.java.tp3TU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
}
