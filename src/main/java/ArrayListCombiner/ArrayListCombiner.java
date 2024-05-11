package ArrayListCombiner;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {

    // Method to append the second ArrayList's items to the first using ? super E
    public static <E> void superCombiner(ArrayList<? super E> list1, ArrayList<E> list2) {
        list1.addAll(list2);
    }

    // Method to append the second ArrayList's items to the first using ? extends E
    public static <E> void extendCombiner(ArrayList<E> list1, ArrayList<? extends E> list2) {
        list1.addAll(list2);
    }
}
