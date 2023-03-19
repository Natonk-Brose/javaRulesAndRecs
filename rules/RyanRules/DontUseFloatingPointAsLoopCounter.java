/**
 * A class that shows the proper type of variable to use as a loop counter
 * NUM09-J: Do not use floating-point variables as loop counters
 * Created by Ryan Leone
 * IT 355
 */
public class DontUseFloatingPointAsLoopCounter
{
    /**
     * Main method that shows the correct type to use as a loop counter
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {
        double sum = 0.0;

        /**
         * Loop to sum up the values between 0.1 and 1.0 (inclusive)
         */
        for(int i = 1; i <= 10; i++)
        {
            /**
             * Converting the loop counter to the correct floating-point number
             */
            sum += i/10.0;
        }
        System.out.println("sum = " + sum);
    }
}
