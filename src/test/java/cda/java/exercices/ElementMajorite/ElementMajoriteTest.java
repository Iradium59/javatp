package cda.java.exercices.ElementMajorite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import cda.java.exercices.ElementMajorite.ElementMajorite;

@RunWith(Parameterized.class)
public class ElementMajoriteTest {

    private final int[] inputArray;
    private final int expectedResult;

    public ElementMajoriteTest(int[] inputArray, int expectedResult) {
        this.inputArray = inputArray;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[]{1, 2, 2, 3, 2, 4, 2, 2, 5}, 2 },
                { new int[]{1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, 3 },
                { new int[]{1, 2, 3, 4, 5}, 1 },
        });
    }

    @Test
    public void testTrouverElementMajorite() {
        int result = ElementMajorite.trouverElementMajorite(inputArray);
        System.out.println("Input Array: " + Arrays.toString(inputArray) + ", Expected Result: " + expectedResult + ", Actual Result: " + result);
        assertEquals(expectedResult, result);
    }
}
