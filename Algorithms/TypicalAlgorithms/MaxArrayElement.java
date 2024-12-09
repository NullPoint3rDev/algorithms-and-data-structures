package TypicalAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MaxArrayElement {
    /* Here we're trying to find the greatest array's element with method "sort()"
           from Arrays

    public static void main(String[] args) {
        int[] ages = {10, 6, 15, 93, 42, 7, 32};
        Arrays.sort(ages);
        int maxAge = ages[ages.length - 1];
        System.out.println(maxAge);
        }
*/


            /* Here we're trying to find the greatest element from only two elements, using method
             "max()" from Math

    public static void main(String[] args) {
        int ageMom = 45;
        int ageDad = 47;

        int maxAge = Math.max(ageDad, ageMom);
        System.out.println(maxAge);
        }
*/

   /* Here we're trying to find the greatest array's element using "for" cycle and method
    "max()" from Math
   public static void main(String[] args) {
       int[] ages = {10, 6, 15, 93, 42, 7, 32};
       int maxAge = 0;
       for (int i = 0; i < ages.length; i++) {
           maxAge = Math.max(maxAge, ages[i]);
       }
       System.out.println(maxAge);
   }
*/

    /* Now let's find a few max elements in array
    public static void main(String[] args) {
        int[] ages = {10, 6, 15, 93, 42, 7, 32};
        int maxAge = 0;
        for (int i = 0; i < ages.length; i++) {
            maxAge = Math.max(maxAge, ages[i]);
        }

        int secondMaxAge = 0;

        for (int i = 0; i < ages.length; i++) {
            if(ages[i] < maxAge) {
            secondMaxAge = Math.max(secondMaxAge, ages[i]);
            }
        }
        System.out.println(maxAge);
        System.out.println(secondMaxAge);
    }
*/

    /* Let's find max array's element that lower than native number. We'll use a function (method).

    public static int findMaxUnderBoundary(int[] inputArray, int topBoundary) {
        int currentMax = Integer.MIN_VALUE;
        for(int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < topBoundary) {
                currentMax = Math.max(currentMax, inputArray[i]);
            }
        }
        return currentMax;
    }

             Now let's use that function to find max elements

    public static int[] findTopElement(int[] inputArray, int numberOfElements) {
        int[] topElements = new int[numberOfElements];
        int previousMax = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfElements; i++) {
            int currentMax = findMaxUnderBoundary(inputArray, previousMax);
            previousMax = currentMax;
            topElements[i] = currentMax;
        }
        return topElements;
    }

               Let's check how it works

    public static void main(String[] args) {
        int[] ages = {34, 94, 33, 102, 45, 10, 14};
        int[] topThreeAges = findTopElement(ages, 3);
        System.out.println(Arrays.toString(topThreeAges));
    }
    */


            /* Now we're going to find unique elements in array. We will use an example with phone
                                         numbers

    public static void main(String[] args) {
        long[] phoneNumbers = new long[] {+79161002030L, +79255558877L, +79219990000L,
        +79161002030L};

        List<Long> uniqueNumbers = new ArrayList<>();

        for (long currentNumber : phoneNumbers) {
            boolean alreadyExists = false;
            for (Long existingNumber : uniqueNumbers) {
                if (existingNumber == currentNumber) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                uniqueNumbers.add(currentNumber);
            }
        }
        System.out.println(uniqueNumbers);

                         Correct arithmetic formula for that: (N + 1) * N / 2
    }
    */


                        /* Now let's get unique elements in sorted array

    public static void main(String[] args) {
        long[] phoneNumbers = new long[] {
                +79000000001L, +79000000001L,
                +79000000002L,
                +79000000003L, +79000000003L,
                +79000000004L, +79000000004L, +79000000004L, +79000000004L,
                +79000000005L
        };

        List<Long> uniqueNumbers = new ArrayList<>();

        long previousNumber = phoneNumbers[0];

        for (int i = 1; i < phoneNumbers.length; i++) {
            if (previousNumber != phoneNumbers[i]) {
                uniqueNumbers.add(previousNumber);
                previousNumber = phoneNumbers[i];
            }
        }
        uniqueNumbers.add(previousNumber);
        System.out.println(uniqueNumbers);
    }

                In the next .classes we will use different kind of sorts!
    */
}
