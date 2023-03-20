package rules.RyanRules;

/**
 * A class that shows the proper way to compare boxed primitives
 * EXP03-J: Do not use the equality operators when comparing values of boxed primitives
 * Created by Ryan Leone
 * IT 355
 */
public class DontUseEqualityOperatorsOnBoxedPrims
{
    /**
     * Main method that shows how to correctly compare boxed primitives
     * @param args  command line arguments provided by the user
     */
    public static void main(String[] args)
    {
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 234;

        /**
         * Checking if i1 has the same value as i2
         * Prints true
         */
        System.out.println(i1.equals(i2));

        /**
         * Checking if i1 has the same value as i3
         * Prints false
         */
        System.out.println(i1.equals(i3));
    }
}
