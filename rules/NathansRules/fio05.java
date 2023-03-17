package rules.NathansRules;

import java.nio.CharBuffer;

public class fio05 {
    public static void main(String[] args) {
        StringWrapper b = new StringWrapper("abcde");
        CharBuffer buff = b.getCopy();
        System.out.println(buff);
    }
}
/**
 * class to wrap a string and fetch a CharBuffer copy of the string
 */
class StringWrapper {
    private char[] charArr;
    public StringWrapper(String s) {
        charArr = s.toCharArray();
    }
    /**
     * creates a CharBuffer copy of the StringWrapper
     * @return CharBuffer copy of the StringWrapper
     */
    public CharBuffer getCopy() {
        return CharBuffer.wrap(charArr).asReadOnlyBuffer(); // read only makes this compliant
    }
}