/**
 * A class that shows the proper way to check if a divisor is equal to 0 to make sure a divide-by-zero error does not occur
 * NUM02-J: Ensure that division and remainder operations do not result in divide-by-zero errors
 * Created by Ryan Leone
 * IT 355
 */
public class DontDivideByZero
{
    /**
     * Main method that shows how to ensure that divide-by-zero errors do not occur
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {
        int i = 10;
        int j = 0;

        /**
         * Checking if j is zero.
         * If true, print out that j is zero. Otherwise, print the result of i/j
         */
        if(j == 0)
        {
            System.out.println("i could not be divided by j because j is 0.");
        }
        else
        {
            System.out.println("i/j = " + i/j);
        }

        /**
         * Checking if j is zero.
         * If true, print out that j is zero. Otherwise, print the result of i%j
         */
        if(j == 0)
        {
            System.out.println("The remainder of i/j could not be calculated because j is 0.");
        }
        else
        {
            System.out.println("i%j = " + i%j);
        }
    }
}
