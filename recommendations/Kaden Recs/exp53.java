import java.util.Scanner;

public class exp53
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Please enter a number: ");
            arr[i] = scan.nextInt();
        }
        
        /**
         * Example of correct use of parenthesis
         * If parenthesis were omitted, arr[4] / 5 would evaluate before
         * the array elements were summed
         */
        int average = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]) / 5;

        System.out.println(average);

        scan.close();
    }
}
