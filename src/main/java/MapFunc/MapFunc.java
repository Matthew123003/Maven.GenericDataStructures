package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {
    // Method to map each element of the input ArrayList using the provided function
    public static <T, R> ArrayList<R> map(ArrayList<T> list, Function<T, R> function) {
        ArrayList<R> result = new ArrayList<>();
        for (T element : list) {
            // Apply the function to each element and add the result to the result list
            result.add(function.apply(element));
        }
        return result;
    }

}
