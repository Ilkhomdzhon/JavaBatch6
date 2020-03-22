package com.syntax.class15;

public class Methods {
	
	
	//creata method that will say welcome 10 time 
	
	
	void sayWelcome() {
		
		for (int i=0 ; i<10; i++) {
			System.out.println("Welcome");
		}
	}
                /// create method that will say any word # number of times
	
	
	   void sayAnything(String word , int times) {
		   for (int i=1; i<=times ; i++ ) {
			   System.out.println(word);
			   
		   }
	   }
	   
	   // creat a method isRaining 
	   /// creat a method that will accept boolean value as a parameter 
	   /// and based on the value it will print message accordingly
	   
	   void isRaining(boolean isRain) {
		   if (isRain) {
			   System.out.println("It is rain stay home and learn Java ");
		   }else {
			   System.out.println("It is not raining for a walk ");
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
}
