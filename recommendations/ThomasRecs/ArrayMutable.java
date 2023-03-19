/**
 * 
 */
package recommendations;


class Array {
	private int[] numbers = new int[10];
	
	/**
	 * Returns the numbers array
	 * @return integer array
	 */
	public int[] getNumbers() {
		return numbers;
	}
	
	
	/**
	 * Sets the numbers array
	 * @param integer array to be set
	 */
	public void setNumbers(int[] newNumbers) {
		numbers = newNumbers;
	}
}

class Wrapper extends Array {
	
	/**
	 * Constructor for the Array wrapper
	 * @param array
	 */
	public Wrapper(int[] array) {
		super.setNumbers(array);
	}
	
	@Override
	/**
	 * Gets the numbers array as a clone
	 * @return integer array
	 */
	public int[] getNumbers() {
		return super.getNumbers().clone();
	}
	
	@Override
	/**
	 * Set the numbers array
	 * @return UnsupportedOperationException()
	 */
	public void setNumbers(int[] newNumbers) {
		throw new UnsupportedOperationException();
	}
}

/**
 * @author Thomas Gray
 *
 */
public class ArrayMutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Array myArray = new Wrapper(new int[]{5, 2, 3});
		int[] array = myArray.getNumbers();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		myArray.setNumbers(new int[] {2,5,3});

	}

}
