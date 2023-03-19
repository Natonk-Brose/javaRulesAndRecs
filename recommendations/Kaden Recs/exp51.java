public class exp51
{
    public static void main(String[] args)
    {
        boolean a = false;
        boolean b = false;

        /**
         * This conditional assigns the value of b to variable a
         * This will evaluate to false
         * Incorrect if programmer's intent is to compare the variables
         */
        if (a = b)
        {
            System.out.println("Hello 1"); //will not print
        }

        /**
         * This conditional compares the value of b to variable a
         * This will evaluate to true
         * Correct if programmer's intent is to compare the variables
         */
        if (a == b)
        {
            System.out.println("Hello 2"); //will print
        }
    }
}
