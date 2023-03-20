package rules.RyanRules;

import java.util.Arrays;

/**
 * A class that shows the proper way to compare arrays
 * EXP02-J: Do not use the Object.equals() method to compare two arrays
 * Created by Ryan Leone
 * IT 355
 */
public class ArrayComparisons
{
    /**
     * Main method that shows how to correctly compare arrays
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};
        int arr3[] = {4,5,6};

        int arr1Ref[] = arr1;

        /**
         * Testing if arr1 contains the same elements as arr2
         * Prints true
         */
        System.out.println(Arrays.equals(arr1, arr2));

        /**
         * Testing if arr1 contains the same elements as arr3
         * Prints false
         */
        System.out.println(Arrays.equals(arr1, arr3));

        /**
         * Testing if arr1Ref is a reference to the same array as arr1
         * Prints true
         */
        System.out.println(arr1Ref == arr1);

        /**
         * Testing if arr1 is a reference to the same array as arr2
         * Prints false (even though they have the same contents)
         */
        System.out.println(arr1 == arr2);
    }
}
