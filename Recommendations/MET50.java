
public class MET50 {
    // Compliant Code. Overloadding is not done, instead we declare public static
    // methods with distinct names
    class Test {
        public static int initializeInt1(int a, int b) {
            return b;
            // Code block 1
        }

        public static int initializeInt2(int c, int d) {
            // Code block 2
        }
    }
}
