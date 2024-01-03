package cda.java.exercices.tp3TU;

public class Stack {
    private static final int MAX_SIZE = 10;
    private int[] elements;
    private int size;

    public Stack() {
        elements = new int[MAX_SIZE];
        size = 0;
    }

    public void push(int value) {
        if (size < MAX_SIZE) {
            elements[size++] = value;
        }
    }

    public int pop() {
        if (size > 0) {
            return elements[--size];
        }
        return 0; // Valeur arbitraire à définir selon vos besoins
    }

    public int peek() {
        if (size > 0) {
            return elements[size - 1];
        }
        return 0; // Valeur arbitraire à définir selon vos besoins
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }
}
