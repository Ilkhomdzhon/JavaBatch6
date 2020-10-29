package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
		// accessing variables from own class 
		dog.breed="Husky";
		dog.color="Grey";
		dog.fur="Too much ";
		dog.size="Big";
		
		// accessing method from own class 
		dog.bark();
		
		 // accessing methods from parent class 
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal=new Animals ();
		
		 // can access only feature define within  it
		 animal.color="Any";
		 animal.size="Any";
		 animal.fur="Any";
           animal.eat();
           animal.beWild();
         
           
	}

}
