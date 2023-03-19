public class exp50 
{
    public static void main(String[] args)
    {
        String person1 = new String("Thelonious");
        String person2 = new String("Thelonious");

        /**
         * Compares the referential equality of two string objects
         * Incorrect if programmer wants to compare the string's contents
         */
        System.out.println(person1 == person2); //prints false

        /**
         * Compares the abstract object equality of two string objects
         * Correct if programmer wants to compare the string's contents
         */
        System.out.println(person1.equals(person2)); //prints true
    }
}
