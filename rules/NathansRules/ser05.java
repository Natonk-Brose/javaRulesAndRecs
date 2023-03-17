package rules.NathansRules;

import java.io.Serializable;
import java.util.ArrayList;

public class ser05 {
    
}

/**
 * simple student class as an example of a serializable class
 */
class Student implements Serializable{
    int id;
    private ArrayList<Course> classes;
    
    /**
     * a simple wrapper class for a string that contains the course name
     * passes the ser05 vibe check because it does not implement serializable
     */
    class Course {
      protected String title;

      protected Course(String t, int c) {
        title = t;
      }
    }
}