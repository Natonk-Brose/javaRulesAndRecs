package NathansRecs;

import java.util.Scanner;

public class num51 {

    /**
     * main method to demonstrate how % does not always return a positive number
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int val = scan.nextInt();
        scan.close();

        int remainder1 = val % 5;
        int remainder2 = absValMod(val, 5);

        System.out.println("Dividing by 5\nRemainder using %: " + remainder1);
        System.out.println("Remainder using absValMod: " + remainder2);
    }

    /**
     * A method that uses the modulus operator and returns the absolute value of the remainder
     * 
     * @param value value to be divided
     * @param divisor the divisor in the modulus operation
     * @return the absolute value of the modulus operation
     */
    private static int absValMod(int value, int divisor) {
        int temp = value % divisor;
        return (temp < 0) ? -temp : temp; 
    }
    
}
