package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry<K, V>> entries;

    public Table() {
        entries = new ArrayList<>();
    }

    // Method to retrieve the value associated with a key
    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null; // Key not found
    }

    // Method to add or update an entry with the given key and value
    public void put(K key, V value) {
        // Check if the key already exists
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                // Update the value if the key exists
                entry = new Entry<>(key, value);
                return;
            }
        }
        // If the key doesn't exist, add a new entry
        entries.add(new Entry<>(key, value));
    }

    // Method to remove an entry with the given key
    public void remove(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                entries.remove(entry);
                return; // Remove only the first occurrence
            }
        }
    }
}
