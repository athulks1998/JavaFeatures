package main;

/**
 * A class that demonstrates the use of pattern matching in Java 16+.
 */
public class PatternMatching {

	/**
	 * This method takes an object and uses pattern matching to determine if it is a
	 * string. If the object is a string, it prints its length. If not, it prints a
	 * message saying so.
	 * 
	 * @param obj the object to check
	 */
	public static void patternMatching(Object obj) {

		// Java 16+ pattern matching with instanceof
		if (obj instanceof String s) {
			System.out.println("Length of string is " + s.length());
		} else {
			System.out.println("Object is not a string.");
		}
	}
}
