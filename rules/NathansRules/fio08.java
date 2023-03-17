package rules.NathansRules;

import java.io.FileInputStream;

public class fio08 {
    /**
     * creates a stream from this file and prints the contents
     * in text form to the console.
     * @param args
     */
    public static void main(String args[]){    
        try{    
            FileInputStream fin = new FileInputStream("rules/NathansRules/fio08.java");    
            int data;
            while ((data = fin.read()) != -1) {  // do not cast here
                System.out.print((char)data);    // cast here
            }

            fin.close();    
        } catch(Exception e) {
            System.out.println(e);
        }    
    }
}
