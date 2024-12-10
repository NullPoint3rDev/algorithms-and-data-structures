package TypicalAlgorithms;

public class BinarySearch {

    /* Let's try to find out native element in array using binary search. We'll make a function
                                 (method) that can help us.
    public static int binarySearch(int[] array, int search) {
        int left = 0; // Left array's side
        int right = array.length - 1;            Right array's side

        int middle = (left + right) / 2;         Searching start position

                 [0, 1, 2, 3], left = 0, right = 3, middle = (0 + 3) / 2 = 1

        while (left <= right) {
            if (array[middle] < search) {
                left = middle + 1;
            } else if (array[middle] > search) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;   We will return -1 if native element is not exists in array
                     Complexity = O(n log n)
    }
    */



    /*       Now let's make an example for deleting array elements (deleting duplicates from array)
                   Say 'HI' to JS, Py, and PHP devs :)

    int removeElementAtIndex(int[] array, int element) {
        for (int i = element - 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        return array.length - 1;
    }

    int[] array = new int[] {15, 23, 20, 5, 15, 20, 15, 20};
    int removeDuplicates(int[] array) {     This function will remove duplicates from array
        int currentLength = array.length;
        int i = 0;
        while (i < array.length) {
            boolean found = false;
            for (int k = i + 1; k < currentLength; k++) {
                if (array[i] == array[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                i++;
                continue;
            }
            else {
                for (int k = i + 1; k < currentLength; k++) {
                    array[k - 1] = array[k];
                }
                currentLength--;
            }
        }
        return currentLength;
    }
    */
}
