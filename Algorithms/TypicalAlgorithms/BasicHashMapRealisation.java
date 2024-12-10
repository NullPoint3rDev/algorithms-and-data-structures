package TypicalAlgorithms;

public class BasicHashMapRealisation {

    /*          Let's take a look at basic realisation of dynamic array first
                    That will help us understand hash functions

    int[] values = new int[8];
    int size = 8;
    int currentIndex = 0;
    public void add(int value) {
        values[currentIndex] = value;
        currentIndex++;
        if (currentIndex == size) {
            reSize(size * 2);
        }
    }
    public void reSize(int newSize) {
        int[] newValues = new int[newSize];
        for (int i = 0; i < size; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
        size = newSize;
    }
    */

                            /* Now lets take a look at the HashMap

    class KeyValuePair {
        public String key;
        public String value;

        public KeyValuePair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    KeyValuePair[] entries = new KeyValuePair[8];
    int size = 8;
    int numberOfElements = 0;

    int hashFunction(String key) {
        return 0;
    }

    public void add(String key, String value) {
        int hash = hashFunction(key);
        int index = hash % size;
        entries[index] = new KeyValuePair(key, value);
        numberOfElements++;
        if (numberOfElements == size) {
            resize(size * 2);
        }
    }
    public void resize(int newSize) {
                                Make new array
        KeyValuePair[] newEntries = new KeyValuePair[newSize];
                                Copy 8 elements from old array
        for (int i = 0; i < size; i++) {
            KeyValuePair entry = entries[i];
            int hash = hashFunction(entry.key);
            int newIndex = hash % newSize;
            newEntries[newIndex] = entry;
        }
        entries = newEntries;
        size = newSize;
    }

    public String get(String key) {
        int hash = hashFunction(key);
        int index = hash % size;
        KeyValuePair entry = entries[index];
        if (entry == null) {
            return null;
        }
        return entry.value;
    }
*/
                        /*
                        Now let's learn how to fix collisions in hash-function realisation

                         */
}

