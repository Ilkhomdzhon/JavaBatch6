package com.syntax.class18;

public class TASK3 {
	
// Create a method that will accept a String as a parameter and return a new String that 
//  consist only of vowels. Method should be available inside the class where it was
//  declared and executed by calling it is name.
//	
	private static String findVowels(String name) {
		String vowels;
		vowels = name.replaceAll("[^aeiouAEIOU]","");
		return vowels;
	}
	public static void main(String[] args) {
		TASK3 obj = new TASK3();
		System.out.println(findVowels("Syntax Technologies"));
	}

}

