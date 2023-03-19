/**
 * A class that shows the how to change integers to floating points before floating-point operations
 * NUM50-J: Convert integers to floating point for floating-point operations
 * Created by Ryan Leone
 * IT 355
 */
public class ConvertIntsToFloatingPointBeforeOperations
{
    /**
     * Main method that shows how to correctly use integers in floating-point operations
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {
        /**
         * Setting a floating-point variable to the result of an integer constant divided by a double constant
         * Prints the result: 0.8333333333333334
         */
        double result1 = 5/6.0;
        System.out.println(result1);

        int i = 5;
        double iDouble = i;

        /**
         * Setting a floating-point variable to the result of a double (that was set to the value of an integer)
         *      divided by a double constant
         * Prints the result: 0.8333333333333334
         */
        double result2 = iDouble/6;
        System.out.println(result2);
    }
}
