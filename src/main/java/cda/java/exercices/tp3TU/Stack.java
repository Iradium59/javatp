package cda.java.exercices.tp3TU;

public class Stack {

    private int[] elements;
    private int top;

    public Stack() {
        this.elements = new int[10];
    }

    public void push(int element) {
        if (top < elements.length - 1) {
            top++;
            elements[top] = element;
        } else {
            throw new IllegalStateException("La stack est pleine");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int poppedElement = elements[top];
            top--;
            return poppedElement;
        } else {
            throw new IllegalStateException("La stack est vide");
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return elements[top];
        } else {
            throw new IllegalStateException("La stack est vide");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }
}
