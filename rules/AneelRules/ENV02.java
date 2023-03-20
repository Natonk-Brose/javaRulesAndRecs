package IT355.Rules;

public class ENV02 {
    /**
     * By calling System.getProperty, we can identify the correct mapping keys.
     * This will ensure that our variables are sanitized and safe from attackers
     **/
    String user = System.getProperty("user.name");
}
