package rules.NathansRules;

import java.util.ArrayList;

public class met00 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if (setOneThroughFive(arr))
            System.out.println(arr.toString());
        else 
            System.out.println("array is null");
    }
    
    /**
     * takes in an existing arraylist parameter and sets
     * it to be equal to [1, 2, 3, 4, 5]. If anything is
     * in the list, then it gets cleared first. 
     * 
     * @param arr any arrayList<int>
     * @return true if successful, false if failure
     */
    public static boolean setOneThroughFive(ArrayList<Integer> arr){
        if (arr == null) //make sure parameter is not null
            return false;
        arr.clear();
        for(int i=1; i <=5; i++)
            arr.add(i);
        return true;
    }
}