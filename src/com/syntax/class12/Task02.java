package com.syntax.class12;

public class Task02 {

	public static void main(String[] args) {
		
//Create a String and if the String is not empty perform the following: 
//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String.
		
		String str= "Morning";
		int index=str.length();
		if(!str.isEmpty()) {
			if ((index%2!=0) && index>=3 ) {
				System.out.println(str.charAt(index/2));
			}
		}else {
			System.out.println("String is Empty");
		}
		
		
		
		
		
		
	}
}
