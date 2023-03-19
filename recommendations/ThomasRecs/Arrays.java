/**
 * 
 */
package recommendations;

/**
 * @author Thomas
 *
 */
public class Arrays {
	
	private int[] array = new int[50];
	private int size = 0;
	
	/**
	 * Returns the array
	 * @return integer array
	 */
	public int[] getArray() {
		//if (size == 0) {
			//return null;
		//} else {
			return array;
		//}
	}
	
	/**
	 * Returns the size of the array
	 * @return integer containing the size
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Adds a value to the array
	 * @param value to be added
	 */
	public void addValue(int value) {
		array[size++] = value;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arrays myArray = new Arrays();
		//myArray.addValue(1);
		//myArray.addValue(2);
		
		int[] test = myArray.getArray();
		int mySize = myArray.getSize();
		for (int i = 0; i < mySize; i++) {
			System.out.println(test[i]);
		}
		System.out.println(test);
		
	}

}
