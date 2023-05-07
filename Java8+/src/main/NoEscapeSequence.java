package main;

/**
 * @author Athul K S
 *
 *  Here we can see how Java 15 have provided an option to format multiline strings without escape sequence 
 */
public class NoEscapeSequence {
	
	/**
	 * @return
	 * New way without escape sequence 
	 */
	public static String getNewPrettyPrintJson() {
		   return """
		          {
		             "firstName": "Piotr",
		             "lastName": "Mińkowski"
		          }
		          """;
		}
	
	
	/**
	 * @return
	 * Traditional way of using escape sequence for special characters like "
	 */
	public static String getOldPrettyPrintJson() {
		   return "{\n" +
		          "     \"firstName\": \"Piotr\",\n" +
		          "     \"lastName\": \"Mińkowski\"\n" +
		          "}";
		}
}
