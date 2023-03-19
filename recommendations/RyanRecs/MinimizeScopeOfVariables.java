/**
 * A class that shows how minimizing a variable's scope helps readability
 * DCL53-J: Minimize the scope of variables
 * Created by Ryan Leone
 * IT 355
 */
public class MinimizeScopeOfVariables {
    /**
     * Main method that shows how one variable per declaration is more readable
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {
        /**
         * Declaring i as part of the for loop statement
         */
        for(int j = 0; j < 5; j++)
        {
            System.out.println("j = " + j);
        }

        int[] array = {1,20};
        swapFirstTwo(array);

        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);

    }
    /**
     * Swaps the first two index values in the array
     * @param arr The array to have its two first index values swapped
     */
    public static void swapFirstTwo(int[] arr)
    {
        /**
         * Declared temp inside the function it is used in rather than as a instance variable
         */
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
