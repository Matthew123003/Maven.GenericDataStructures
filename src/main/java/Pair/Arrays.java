package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    // Method to return a Pair containing the first and last element of the ArrayList
    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a) {
        if (a == null || a.isEmpty()) {
            return null;
        }
        E first = a.get(0);
        E last = a.get(a.size() - 1);
        return new Pair<>(first, last);
    }

    // Method to find the minimum element in the ArrayList
    public static <E extends Comparable<E>> E min(ArrayList<E> a) {
        if (a == null || a.isEmpty()) {
            return null;
        }
        E min = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).compareTo(min) < 0) {
                min = a.get(i);
            }
        }
        return min;
    }

    // Method to find the maximum element in the ArrayList
    public static <E extends Comparable<E>> E max(ArrayList<E> a) {
        if (a == null || a.isEmpty()) {
            return null;
        }
        E max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).compareTo(max) > 0) {
                max = a.get(i);
            }
        }
        return max;
    }

    // Method to return a Pair containing the minimum and maximum elements of the ArrayList
    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> a) {
        E min = min(a);
        E max = max(a);
        return new Pair<>(min, max);
    }
}