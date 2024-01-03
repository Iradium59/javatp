package cda.java.tp3TU;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import cda.java.exercices.tp3TU.Stack;
public class StackTest {
    @Test
    void testStackOperations() {
        Stack stack = new Stack();

        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());

        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());

        stack.pop();
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());

        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        assertTrue(stack.pop() == 1);
    }
}
