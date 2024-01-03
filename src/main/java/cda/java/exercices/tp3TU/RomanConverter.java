package cda.java.exercices.tp3TU;

public class RomanConverter {
    public static String convertToRoman(int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        } else {
            throw new IllegalArgumentException("Invalid number: " + arabicNumber);
        }
    }
}