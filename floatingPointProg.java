//aquamarine program
//IT355 Project 1
//By: Curtis Bryant, Ryan Leone, Thomas Gray, Nathan Brose, Kaden Hargrove, Aneel Gillan​
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.*;

/**
  * Class that has main to get input values from two files, 
  * calculate the average of the absolute values of the values and if the averages are the same,
  * and print if values were the same in both files after being absolute valued
  */
public class floatingPointProg {


    /**
    *   Returns the average value of the array values
    *   @param array the array to be averaged
    *   @return the average value
    */
    private static double average(double[] array) {
        //NUM02-J: Ensure that division and remainder operations do not result in divide-by-zero errors 
        // (array.length used to calculate the average)
        //MET00-J: Validate method arguments 
        //ERR08-J: Do not catch NullPointerException or any of its ancestors
        //ENV06-J: Production code must not contain debugging entry points
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
        boolean length = false;
        if (array.length==0) {
            length=true;
        }


        //EXP55-J: Use the same type for the second and third operands in conditional expressions
        double[] retArray = length ? new double[]{} : array.clone();

        //MET55-J: Return an empty array or collection instead of a null value for methods that return an array or collection
        //EXP51-J: Do not perform assignments in conditional expressions
        if (length==true) {
            //return null; <-- BAD IDEA
            return new double[]{}; // "return array" also could work
        }

        //NUM09-J: Do not use floating-point variables as loop counters
        for (int i = 0; i < retArray.length; i++) { // declaring i as an int works great here
            if (retArray[i] < 0.0) { //EXP-52 (use braces for conditional blocks)
                retArray[i] = Math.abs(retArray[i]);
            }
        }
        return retArray;
    }


    /**
    * Filters a string for possible errors
    * @param inputString The input string to be filtered
    * @return The converted string
     */
    public static String filter(String inputString) {
        String str = Normalizer.normalize(inputString, Form.NFKC);

        str = str.replaceAll(".jar", ".txt");
        Pattern p = Pattern.compile("^[a-z]+[0-9].txt$");
        Matcher m = p.matcher(str);
        if (m.find()) {
            //ERR07-J: Do not throw RuntimeException, Exception, or Throwable 
            //throw new RuntimeException("Invalid input"); <-- BAD IDEA
            return str;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    //DCL54-J: Use meaningful symbolic constants to represent literal values in program logic
    //Both arrays will have the same size guaranteed (assumption is that both files have exactly 7 values)
    private static final int ARRAY_SIZE = 7;    

    public static void main(String[] args)
    {
        try {
            //FIO02-J: Detect and handle file-related errors 
            File file1;
            File file2;
            Scanner sc = new Scanner(System.in);
            boolean isValid = false;
            String fileName = "";
            while (isValid == false) {
                System.out.println("Enter the first file name");
                fileName = sc.nextLine();
                if (fileName.equals(null) || fileName.equals("")) {
                    System.out.println("Invalid input");
                } else {
                    isValid = true;
                }
            }
            //IDS11-J: Perform any string modifications before validation
            fileName = filter(fileName);
            file1 = new File(fileName);


            isValid = false;
            while (isValid == false) {
                System.out.println("Enter the second file name");
                fileName = sc.nextLine();
                if (fileName.equals(null) || fileName.equals("")) {
                    System.out.println("Invalid input");
                } else {
                    isValid = true;
                }
            }
            fileName = filter(fileName);
            file2 = new File(fileName);
            //File file1 = new File("input1.txt");
            //File file2 = new File("input2.txt");

            Scanner fileReader1 = new Scanner(file1);
            Scanner fileReader2 = new Scanner(file2);

            //DCL52-J: Do not declare more than one variable per declaration
            //DCL53-J: Minimize the scope of variables (arrays delcared right before use)
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
                //EXP03-J: Do not use the equality operators when comparing values of boxed primitives (don't use == or !=)
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
                //Non complient code would have been: posArr1.equals(posArr2)
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
            sc.close();
            Runtime.getRuntime().exit(1); //FIO14-J: Perform proper cleanup at program termination

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        
    }

}
