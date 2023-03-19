/**
 * 
 */
package questions;

import java.util.Scanner;

/**
 * @author Thomas Gray
 *
 */
public class ContainsHi {
	
	
	/**
	 * Checks if a string contains "Hi"
	 * @param Input string
	 * @return True if the string contains "Hi", false if otherwise
	 */
	public static boolean containsHi(String str) {
		str = str.toLowerCase();
		if (str==null) {
			throw new NullPointerException();
		} else if (str.contains("hi")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		System.out.println(containsHi((String)null));
		sc.close();

	}

}
