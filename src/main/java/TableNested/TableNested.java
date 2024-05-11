package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    // Nested Entry class
    public static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    // Other methods of Table class...

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
