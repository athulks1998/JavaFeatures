package main;

/**
 * @author Athul K S
 * Immutable objects using record feature introduced in Java 14
 */
public record RecordFeature(String name, int age) {
	// No additional code needed, getters for 'name' and 'age' are automatically generated
}

/*
 * The same functionality as above can be achieved using a class and manually implementing the getters:
 * 
 * public class PersonOld {
 * 
 *     private final String name;
 *     private final int age;
 * 
 *     public PersonOld(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 * 
 *     public String getName() {
 *         return name;
 *     }
 * 
 *     public int getAge() {
 *         return age;
 *     }
 * }
 */
