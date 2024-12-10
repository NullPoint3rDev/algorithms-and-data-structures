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

}
