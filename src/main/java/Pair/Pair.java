package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable<E>> {
    private E first;
    private E second;

    // Constructor to set the values of the pair
    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    // Method to get the first value of the pair
    public E getFirst() {
        return first;
    }

    // Method to get the second value of the pair
    public E getSecond() {
        return second;
    }

    // Method to return the minimum of the pair
    public E min() {
        return (first.compareTo(second) < 0) ? first : second;
    }

    // Method to return the maximum of the pair
    public E max() {
        return (first.compareTo(second) > 0) ? first : second;
    }
}
