package NathansRecs;

import java.util.ArrayList;

public class met54 {
    public static void main(String[] args) {
        // initialize student
        Student s = new Student();

        //testing addClass
        if (s.addClass("math"))
            System.out.println("added math");
        else
            System.out.println("math already added");
        System.out.println("students classes: " + s);

        if (s.addClass("english"))
            System.out.println("added english");
        else
            System.out.println("english already added");
        System.out.println("students classes: " + s);

        if (s.addClass("math"))
            System.out.println("added math");
        else
            System.out.println("math already added");
        System.out.println("students classes: " + s);

        //testing removeClass

        if (s.removeClass("english"))
            System.out.println("removed english");
        else
            System.out.println("english acould not be found");
        System.out.println("students classes: " + s);

        if (s.removeClass("english"))
            System.out.println("removed english");
        else
            System.out.println("english acould not be found");
        System.out.println("students classes: " + s);
    }    
}

/**
 * An over simplified Student class. The only stored data
 * in this class is an array of classes the student is taking
 */
class Student {
    private ArrayList<String> classes = new ArrayList<>();
    
    /**
     * adds a class to the classes array
     * @param className a string representing the name of the class being added
     * @return true if successfully added, false if the class already existed
     */
    public boolean addClass(String className) {
        if (classes.contains(className)) {
            return false;
        }
        else {
            classes.add(className);
            return true;
        }
    }

    /**
     * removes a class to the classes array
     * @param className a string representing the name of the class being removed
     * @return true if successfully removed, false if classes did not contain the class
     */
    public boolean removeClass(String className) {
        if (classes.contains(className)) {
            classes.remove(className);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return classes.toString();
    }
}