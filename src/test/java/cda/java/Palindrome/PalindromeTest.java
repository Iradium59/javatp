package cda.java.Palindrome;
import org.junit.Test;
import static org.junit.Assert.*;

import cda.java.exercices.palindrome.Palindrome;
public class PalindromeTest {

    @Test
    public void testIsPalindromeWithPalindromeNumber() {
        assertTrue(Palindrome.isPalindrome(1221));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        assertFalse(Palindrome.isPalindrome(1234));
    }

    @Test
    public void testIsPalindromeWithSingleDigitNumber() {
        assertTrue(Palindrome.isPalindrome(5));
    }

    @Test
    public void testIsPalindromeWithZero() {
        assertTrue(Palindrome.isPalindrome(0));
    }

    @Test
    public void testIsPalindromeWithNegativeNumber() {
        assertFalse(Palindrome.isPalindrome(-121));
    }

    // Vous pouvez ajouter d'autres tests selon les cas de votre application.

}
