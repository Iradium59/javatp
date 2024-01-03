package cda.java.exercices.ContientDoublon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ContientDoublonTest {

    private final int[] inputArray;
    private final boolean expectedResult;

    public ContientDoublonTest(int[] inputArray, boolean expectedResult) {
        this.inputArray = inputArray;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[]{1, 2, 3, 4, 5}, false },  // Tableau sans doublons
                { new int[]{1, 2, 3, 4, 5, 1}, true },  // Tableau avec des doublons
                { new int[]{}, false }  // Tableau vide
        });
    }

    @Test
    public void testContientDoublon() {
        boolean result = ContientDoublon.contientDoublon(inputArray);
        System.out.println("Input Array: " + Arrays.toString(inputArray) + ", Expected Result: " + expectedResult + ", Actual Result: " + result);
        assertEquals(expectedResult, result);
    }
}