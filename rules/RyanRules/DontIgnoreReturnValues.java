package rules.RyanRules;

/**
 * A class that shows why not ignoring return values is important
 * EXP00-J: Do not ignore values returned by methods
 * Created by Ryan Leone
 * IT 355
 */
public class DontIgnoreReturnValues
{
    /**
     * Main method that shows how to correctly acknowledge return values
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {

        String str = " Hello World! ";
        /**
         * Setting str to the return value of str.trim() to obtain str without the spaces on each end
         * If str was not set to the result, str would remain unchanged because Strings are immutable
         */
        str = str.trim();

        /**
         * Prints "Hello World!" not " Hello World! "
         */
        System.out.println(str + "\n");
    }
}
