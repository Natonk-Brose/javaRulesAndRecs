package rules.Rules_Aneel;

public class ERR08 {
    boolean nameConfirmation(String x, Object ApplicationName) {
        /**
         * Checking if the string variable is null.
         * This will handle NullPointerException's
         **/
        if (x == null) {
            return false;
        }
        return true;
    }
}
