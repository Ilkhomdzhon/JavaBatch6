package com.syntax.class14;

public class MethodExamples {
	
	// want to create a method that will greeting a person 
	
	void greet() {
		System.out.println("Hello Sarmed");
		
	}
	void greet1 (String name) {
		System.out.println("Hello"+name);
	}
	
	public static void main(String[] args) {
		
		// how do I call method greet ?-->first we need to creat an Object of the class
		// where that method belongs 
	
			
	//	((className variableName=newClassname();        )))
		
		MethodExamples object1=new MethodExamples ();
		object1.greet();
		
		object1.greet1("Sarmed");
		object1.greet1("Faisal ");
		object1.greet1("John");
		object1.greet1("Gulen");
		
				
		
		
		
	}
	
	

}
