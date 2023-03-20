/**
 * 
 */

package rules.ThomasRules;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Thomas Gray
 *
 */
public class Strings {
	
	/**
	 * Method to filter a string through to be used later in the program
	 * @param String to be filtered
	 * @return String that was filtered
	 */
	public static String filter(String s) {
		String str = Normalizer.normalize(s, Form.NFKC);
		
		str = str.replaceAll("fun", "");
		
		Pattern p = Pattern.compile("someinthesun");
		Matcher m = p.matcher(str);
		if (m.find()) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		return str;//.replaceAll("fun", "");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "somefuninthesun";
		System.out.println(filter(input));
	}

}
