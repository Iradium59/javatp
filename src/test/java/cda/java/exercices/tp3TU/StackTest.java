package cda.java.tp3TU;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import cda.java.exercices.tp3TU.Stack;

public class StackTest {

    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);

        assertEquals(10, stack.peek());
        assertEquals(10, stack.pop());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

        stack.push(42);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsFull() {
        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        assertTrue(stack.isFull());
    }

    @Test
    public void testPushBeyondCapacity() {
        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        assertThrows(StackOverflowError.class, () -> stack.push(42));
    }
}
