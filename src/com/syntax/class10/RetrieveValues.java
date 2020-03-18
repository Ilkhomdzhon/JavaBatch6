package com.syntax.class10;

public class RetrieveValues {

	public static void main(String[] args) {
		

		char[] grades= {'A','B','C','D','E','F'};
		// getting all elements 
		
		for (int i=0 ; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		System.out.println("---PRINTING USING ADVANCED FOR LOOP-----");
		
		for (char grade:grades) {
			System.out.print(grade+" ");
			
			

		}
		
		// create an array of fruits and retrieve all elements 
		
		
		String []fruits= {"Banana","Kiwi","Apple","Mango "};
		// if fruit is your favorite --> that is your favority and retriew
		for (String fruit:fruits) {
			
			if (fruit.equals("Apple")) {
				
				System.out.println(fruit+" is your favorite fruits");
				
			}else {
				System.out.println(fruit);
			}
			
			System.out.println(fruit);
		}
		
		System.out.println("=================================================");
		 /// /regular for loop
		for (int i=0 ; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
	}

}
