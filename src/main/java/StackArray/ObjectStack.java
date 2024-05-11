package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public ObjectStack() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Pushes an element onto the stack
    public void push(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // Pops an element from the stack
    public E pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        E element = peek();
        elements[--size] = null;
        return element;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the top element of the stack without removing it
    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return (E) elements[size - 1];
    }

    // Resize the array to double its current capacity
    private void resize() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
