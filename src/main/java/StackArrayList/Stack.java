package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack(){
        elements = new ArrayList<>();
    }

    // Pushes an element onto the stack
    public void push(E element) {
        elements.add(element);
    }

    // Pops an element from the stack
    public E pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
