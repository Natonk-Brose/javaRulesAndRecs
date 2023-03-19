/**
 * 
 */
package recommendations;

/**
 * @author Thomas
 *
 */
public class Conditional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String numbers = "123"; // change type to Integer to resolve issue
		Integer num = 456;
		
		boolean bool = false;
		//System.out.println(bool ? numbers : num);
		Object obj = (bool ? numbers : num); // Obj is a String when bool is true, Integer when false
		
		System.out.println(obj);
		
		num = (Integer)obj/2; // will not work when bool is true
		System.out.println(num);
		
	}

}
