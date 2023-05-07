package main;



/**
 * @author Athul K S
 * INFO : Class to show how features are used . Run the main method to see how those features work 
 *
 */
public class FeatureImplementation implements JavaUpdatedInterface {

	public static void main(String[] args) {
		

		
		//Records are immutable data objects from jdk 14
        RecordFeature recordObject = new RecordFeature("athul", 25);
        System.out.println("name is "+ recordObject.name()+" and age is "+ recordObject.age());
        
        // Pattern Matching
        PatternMatching.patternMatching(1);
        PatternMatching.patternMatching("abc");
        
		//Switch case with Pattern Matching 
		System.out.println(SwitchCase.newSwitchCase(6));
		
		//Print a Multiline String with no escape sequence 
		System.out.println( NoEscapeSequence.getNewPrettyPrintJson());
	
	}

}
