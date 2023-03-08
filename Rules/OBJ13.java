package IT355.Rules;

public class OBJ13 {
  // Compliant Code
  // As shown a private static final array variable is used to initate the object.
  // It is then cloned in the public method and returned
  private static final TestType[] OBJECT_ARR = {};

  public static final TestType [] Object() {
        return OBJECT_ARR.clone();
}
