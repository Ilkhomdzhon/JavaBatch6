package com.syntax.class18;

public class Task1 {
	
//Write a program that will have a constructor: one with parameters and second without any parameters. 
//	Create a separate Test class where you will execute both of the constructors.

	 
	Task1(){
		System.out.println("I am constructor without any parameters");
	}
	Task1(String name, int num){
		System.out.println("Im a constructor with String and Integer");
		
	}
	public static void main(String[] args) {
		
		Task1 ccc = new Task1();
		
		Task1 ccc1 = new Task1("Ilhom",372);
		

	}
}
