/**
 * 
 */
package questions;

import java.io.File;
import java.util.Scanner;

/**
 * @author Thomas
 *
 */
public class Files {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "";
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		while (isValid==false) {
			System.out.println("Enter your file name: ");
			fileName = sc.nextLine();
			if (fileName.equals(null) || fileName.equals("")) {
				System.out.println("Invalid input");
			} else {
				isValid = true;
			}

		}
		File file = new File(fileName);
		if (file.canWrite() == false) {
			System.out.println("This file cannot be written to");
		} else {
			System.out.println("This file can be written to");
		}
		if (!file.delete()) {
			System.out.println("Deletion failed");
		}
		sc.close();
	}

}
