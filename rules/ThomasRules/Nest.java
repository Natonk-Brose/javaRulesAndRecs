/**
 * 
 */
package rules.ThomasRules;

/**
 * @author Thomas Gray
 *
 */
public class Nest {
	private String password = "abcd1234";
	
	public class SubNest {
		/**
		 * Gets the password
		 * @return String containing the password
		 */
		public String getPassword() {
			return password;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nest myNest = new Nest();
		Nest.SubNest mySubNest = myNest.new SubNest();
		
		System.out.println(mySubNest.getPassword());
	}

}
