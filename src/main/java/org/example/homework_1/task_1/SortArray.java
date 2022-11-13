package org.example.homework_1.task_1;

import java.util.Arrays;


/**
 *  @author Omenyuk Vyacheslav
 *  The sortArray method takes an array of
 *  numbers and a variable N - which holds the number of
 *  elements in the array.
 *  The sortArray method fills the array with random
 *  numbers [-5, 5], collects positive elements in a
 *  separate array and sorts them in ascending order
 */

public class SortArray {
    public static int sortArray(int[] array){


        // Filling an array with random numbers
//        for (int i = 0; i < array.length; i++) {
//            array[i] = ((int)(Math.random() * N) - 5);
//        }
//        System.out.println("Input array elements: " + Arrays.toString(array));

        int positive = 0;
        for (int element : array) {
            if (element >= 0) {
                positive++;
            }
        }


        int[] allPositive = new int[positive]; // Creating allPositive array to fill with positive numbers
        positive = 0;

        // Filling an (allPositive) array with positive numbers
        for (int element : array) {
            if (element >= 0) {
                allPositive[positive++] = element;
            }
        }

        System.out.println("Positive elements: " + Arrays.toString(allPositive));

        // Sorted positive array
        for (int i = 0; i < allPositive.length - 1; i++) {
            for (int j = i + 1; j < allPositive.length; j++) {
                if (allPositive[i] >= allPositive[j]) {
                    int buf = allPositive[i];
                    allPositive[i] = allPositive[j];
                    allPositive[j] = buf;
                }
            }

        }
        System.out.println("Sorted array: " +  Arrays.toString(allPositive));
        int lengthAllPositive = allPositive.length-1;

        return allPositive[lengthAllPositive];
    }


}
