/**
 * A class that shows how using meaningful constants can help when programming
 * DCL54-J: Use meaningful symbolic constants to represent literal values in program logic
 * Created by Ryan Leone
 * IT 355
 */
public class MeaningfulSymbolicConstantsInsteadOfLiterals
{
    /**
     * Main method that shows how symbolic constants are better than using literals
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {
        /**
         * The head of IT may change so being able to change the name in one place is convenient
         */
        String HEAD_OF_IT = "John Smith";
        /**
         * The head of IT may get a raise
         */
        double HOURLY_PAY = 40.0;
        /**
         * The head of IT may start working more per week
         */
        int HOURS_PER_WEEK = 8;

        System.out.println("The head of IT is " + HEAD_OF_IT + ".");
        System.out.println(HEAD_OF_IT + " caries out many important jobs for the company.");
        /**
         * HOURLY_PAY and HOURS_PER_WEEK have a very clear meaning, and it is easy to understand the calculation
         */
        System.out.println(HEAD_OF_IT + " is paid $" + (HOURLY_PAY * HOURS_PER_WEEK) + " per week of work.");
    }
}
