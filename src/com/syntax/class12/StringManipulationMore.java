package com.syntax.class12;

public class StringManipulationMore {

	public static void main(String[] args) {
		///to get substring from a given String
		//substring=String inside your String
		
		System.out.println("-------substring() FUNCTION----------");
		
		String str ="Today is rainy day";
		// is a rainy day 
		String partialString=str.substring(6); //start from 6 until the end of String
		System.out.println(partialString);
		
		// rainy day 
		partialString=str.substring(9);
		System.out.println(partialString);
		
		//Today 
		partialString=str.substring(0, 5);
		System.out.println(partialString);
		
		//// rainy 
		
		partialString=str.substring(9, 15);
		System.out.println(partialString);
		
		
		
		
	}

}
