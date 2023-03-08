//aquamarine program
//IT355 Project 1
//By: Curtis Bryant, Ryan Leone, Thomas Gray, Nathan Brose, Kaden Hargrove, Aneel Gillan​
import java.io.*;
import java.util.*;
import java.lang.Math;

public class floatingPointProg {


    /**
    *   Returns the average value of the array values
    *   @param array the array to be averaged
    *   @return the average value
    */
    private static double average(double[] array) {
        //NUM02-J: Ensure that division and remainder operations do not result in divide-by-zero errors 
        //MET00-J: Validate method arguments 
        if (array == null || array.length == 0) 
        {
            return -9999999.0;
        }

        double total = 0.0;

        //NUM09-J: Do not use floating-point variables as loop counters  
        for (int i = 0; i < array.length; i++) {
            total+=array[i];
        }

        //NUM50-J: Convert integers to floating point for floating-point operations
        double average = total / ((double) array.length);

        return average;
    }
    
    /**
    * Returns the absolute value of the array values
    * @param array The array to be converted
    * @return The converted double array
    *
    */
    private static double[] convertToPositive(double[] array) {
        
        //MET55-J: Return an empty array or collection instead of a null value for methods that return an array or collection
        if (array.length == 0) {
            //return null; <-- BAD IDEA
            return new double[]{}; // "return array" also could work
        }

        //NUM09-J: Do not use floating-point variables as loop counters
        for (int i = 0; i < array.length; i++) { // declaring i as an int works great here
            if (array[i] < 0.0) { //EXP-52 (use braces for conditional blocks)
                array[i] = Math.abs(array[i]);
            }
        }
        return array;
    }

    //DCL54-J: Use meaningful symbolic constants to represent literal values in program logic
    //Both arrays will have the same size guaranteed (assumption is that both files have exactly 7 values)
    private static final int ARRAY_SIZE = 7;    

    public static void main(String[] args)
    {

        try {

            //  Thomas check stuff for pattern matching :)
            File file1 = new File("input1.txt");
            File file2 = new File("input2.txt");

            Scanner fileReader1 = new Scanner(file1);
            Scanner fileReader2 = new Scanner(file2);

            //DCL52-J: Do not declare more than one variable per declaration
            //DCL53-J: Minimize the scope of variables 
            double [] arr1 = new double[ARRAY_SIZE];
            double [] arr2 = new double[ARRAY_SIZE];

            int arr1NumElements = 0;

            while (fileReader1.hasNextDouble()) 
            {
                arr1[arr1NumElements] = fileReader1.nextDouble();
                arr1NumElements++;
            }

            int arr2NumElements = 0;

            while (fileReader2.hasNextDouble())
            {
                arr2[arr2NumElements] = fileReader2.nextDouble();
                arr2NumElements++;
            }
            
            double [] posArr1 = convertToPositive(arr1);
            double [] posArr2 = convertToPositive(arr2);

            Double average1 = average(posArr1);
            Double average2 = average(posArr2);

            if(average1.equals(-9999999.0)) 
            {
                System.out.println("The first array was invalid");
            }
            else if(average2.equals(-9999999.0))
            {
                System.out.println("The second array was invalid");
            }
            else
            {
                //EXP03-J: Do not use the equality operators when comparing values of boxed primitives  
                if(average1.equals(average2))
                {
                    System.out.println("The average of the two arrays was the same");
                }
                else
                {
                    System.out.println("The average of the two arrays was NOT the same");
                }

                System.out.println("Average of posArr1 is " + average1);
                System.out.println("Average of posArr2 is " + average2);


                System.out.println("\n");

                //EXP02-J: Do not use the Object.equals() method to compare two arrays  
                if(Arrays.equals(posArr1, posArr2))
                {
                    System.out.println("posArr1 and posArr2 are equal");
                }
                else
                {
                    System.out.println("posArr1 and posArr2 are NOT equal");
                }

            }
            

            fileReader1.close();
            fileReader2.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        
    }

}