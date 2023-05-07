package main;

/**
 * A class demonstrating the use of the new switch expression feature introduced
 * in Java 12. The new switch expression allows multiple constant labels to be
 * associated with a single case statement, as well as the use of an arrow
 * symbol (->) for more concise syntax.
 */
public class SwitchCase {

	/**
	 * Returns a string indicating whether the given day represents a workday or
	 * weekend, using the new switch expression.
	 * 
	 * @param day An integer representing the day of the week, where 1 represents
	 *            Monday and 7 represents Sunday.
	 * @return A string indicating whether the given day is a workday, weekend, or
	 *         invalid day.
	 */
	public static String newSwitchCase(int day) {
		return switch (day) {
		case 1, 2, 3, 4, 5 -> "workday";
		case 6, 7 -> "weekend";
		default -> "invalid";
		};
	}

	/**
	 * Returns a string indicating whether the given day represents a workday or
	 * weekend, using the traditional switch case statement.
	 * 
	 * @param day An integer representing the day of the week, where 1 represents
	 *            Monday and 7 represents Sunday.
	 * @return A string indicating whether the given day is a workday, weekend, or
	 *         invalid day.
	 */
	public static String oldMultiSwitch(int day) {
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return "workday";
		case 6:
		case 7:
			return "weekend";
		default:
			return "invalid";
		}
	}
}
