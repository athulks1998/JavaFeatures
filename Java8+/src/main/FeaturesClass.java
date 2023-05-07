package main;



public class FeaturesClass {

	public static void main(String[] args) {
		
		
		System.out.println(SwitchCase.newSwitchCase(6));
		
		//Records are immutable data objects from jdk 14
        RecordFeature recordObject = new RecordFeature("athul", 25);
        
        System.out.print("name is "+ recordObject.name()+" and age is "+ recordObject.age());
        
      
        System.out.println("last");
	}

}
