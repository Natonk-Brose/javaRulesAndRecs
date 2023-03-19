/**
 * 
 */
package recommendations;

/**
 * @author Thomas Gray
 *
 */
public class Enum {
	
	public enum Day {SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
		public int getDay() {
			return ordinal() + 1;
		}
		
		private final int dayOfWeek;
		
		Day(int dayOfWeek) {this.dayOfWeek = dayOfWeek;}
		
		/**
		 * Returns the day of the week
		 * @return integer representing the enum as a day of the week
		 */
		public int getDayOfWeek() {
			return dayOfWeek;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Day sunday = Day.SUNDAY;
		System.out.println(sunday.getDay()); // unsafe
		System.out.println(sunday.getDayOfWeek()); // safe

	}

}
