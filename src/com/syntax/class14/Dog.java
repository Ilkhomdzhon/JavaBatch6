package com.syntax.class14;

public class Dog {

	
   ////Task 1 
	  /// create dog 
	 

	String breed;
	String color;
	String name;
	int age;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.breed="Buldog";
		dog1.color="Black";
		dog1.name="Boxer";
		dog1.age=1;
		
		
		dog1.bark();
		dog1.eat();
		dog1.run();
		
		
		System.out.println("=======================SPACE=======================");
		Dog dog2=new Dog();
		dog2.breed="Alabay";
		dog2.color="White";
		dog2.age=4;
		dog2.name="Koracha";
		
		dog2.bark();
		dog2.eat();
		dog2.run();
		
		
		
		
		
		// print I have a white alabay named kora
		
		System.out.println("I have a "+dog2.color+" "+dog2.breed+" named "+dog2.name);
		
		
		
	}
	void eat() {
		System.out.println(name+ " eats too much ");
	}
	void bark() {
		System.out.println(name+ " can bark ");
	}
	void run() {
		System.out.println(name+" runs very fast");
	}

}
	     
	
	

