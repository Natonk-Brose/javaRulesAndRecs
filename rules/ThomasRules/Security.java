/**
 * 
 */
package questions;

import java.lang.SecurityManager;
import java.util.ArrayList;

/**
 * @author Thomas Gray
 *
 */
public class Security {
	
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	/**
	 * Removes an element from the ArrayList
	 * @param element to be removed
	 * @return void
	 */
	public void removeElement(Integer element) {
		checkAccess("removeEntryPermission");
		arrayList.remove(element);
	}
	
	/**
	 * Checks if the caller has access to remove an element from the ArrayList
	 * @param perm The permission
	 * @return void
	 */
	private void checkAccess(String perm) {
		SecurityManager sm = System.getSecurityManager();
		if (sm != null) { // should fail since System does not have a security manager set up
			// Good idea to include one in sensitive programs
			sm.checkSecurityAccess(perm);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Security s = new Security();
		s.arrayList.add((Integer)5);
		s.removeElement(5);
		if (s.arrayList.contains(5) ) {
			System.out.println("Deletion failed");
		} else {
			System.out.println("Deletion successful");
		}

	}

}
