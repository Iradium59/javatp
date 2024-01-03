package cda.java.exercices.tp3TU;

public class Stack {

    private int[] array;
    private int top;

    public Stack() {
        this.array = new int[10];
        this.top = -1;
    }

    public void push(int element) {
        if (top < array.length - 1) {
            top++;
            array[top] = element;
        } else {
            throw new StackOverflowError("Stack is full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int popped = array[top];
            top--;
            return popped;
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return array[top];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }
}

