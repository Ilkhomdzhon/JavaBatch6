package com.syntax.class12;

public class Task05 {

	public static void main(String[] args) {
		
//   Create a String that should be combination of letters, numbers and special characters. 
//   Find out how many alpha characters are there in the String
		
		String combine= "Combination-372$$$$%%^^^&&";
		combine=combine.replaceAll("[^A-Za-z0-9]", " ");
		System.out.println(combine);
		
		
	}

}
