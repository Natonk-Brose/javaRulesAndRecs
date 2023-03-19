import java.util.Scanner;

public class exp52
{
    public void grantAccess()
    {
        System.out.println("Access granted!");
    }

    public static void main(String[] args)
    {
        exp52 obj = new exp52();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        /**
         * Example of code where programmer properly used curly braces
         * to enclose code blocks of if/else statements
         */
        if (number != 12)
        {
            System.out.println("The number is not correct.");
        }
        else
        {
            System.out.println("The number is 12!");
            obj.grantAccess(); //only grants access if user enters correct number
        }

        scan.close();
    }
}






// /**
//  * Example of code where programmer should use curly braces
//  * to enclose code blocks of if/else statements
//  * This can cause unexpected behavior and security vulnerabilities
//  */
// if (number != 12)
//     System.out.println("The number is not correct.");
// else
//     System.out.println("The number is 12!");
//     obj.grantAccess(); //always grants access to user