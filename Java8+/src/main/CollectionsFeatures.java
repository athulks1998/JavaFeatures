package main;

import java.util.*;

/**
 * INFO: List.of, Map.of, and Set.of can be used to create immutable collections in one step.
 *       The forEach method provides a more concise way to iterate over collections.
 *       The computeIfAbsent method allows you to compute a value for a key only if it is not already present in the map.
 */
public class CollectionsFeatures {

	// Note that the lists , maps and set created below are Immutable 
    public List<String> fruits = List.copyOf(Arrays.asList("apple", "banana", "orange"));

    public Map<Integer, String> numbermap = Map.copyOf(Map.of(1, "one", 2, "two", 3, "three"));

    public Set<String> set = Set.of("apple", "banana", "orange");

    String[] fruitsArray = {"apple", "banana", "orange"};

    // asList returns a mutable list 
    public List<String> fruits2 = Arrays.asList(fruitsArray);

    /**
     * Demonstrates the use of streams and filters with Optional.
     * @param fruit The fruit to search for in the list.
     */
    public void useOptional(String fruit) {
        var filterOut = this.fruits.stream().filter(f -> f.equals(fruit)).findFirst();

        // Use of ifPresentOrElse
        filterOut.ifPresentOrElse(data -> System.out.println("Element found"), () -> System.out.println("No Result"));
    }


    /**
     * Demonstrates how to use the computeIfAbsent method to compute a value for a key only if it is not already present in the map.
     * @param fruit The fruit to count.
     */
    public void useComputeIfAbsent(String fruit) {
    	  // Note that these methods only work for mutable maps 
    	  Map<Integer, String> numbers = new HashMap<>();
          numbers.put(1, "one");
          numbers.computeIfAbsent(1, k -> "seven");
          numbers.computeIfAbsent(8, k -> "eight");
          numbers.computeIfPresent(1, (k,v)-> "two");// does the exact opposite changes the value if present 
    }
}
