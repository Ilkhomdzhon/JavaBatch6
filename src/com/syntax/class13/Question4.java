package com.syntax.class13;

public class Question4 {

	public static void main(String[] args) {

		/*
		 * Find out how many alpha character are present in a String ? Find number of
		 * words in String
		 */

		String str = "halksjd980732jlkj  uoi879";
		str.replaceAll("[^A-Za-z]", "");
		int number = str.length();
		System.out.println("Number of alpha character = " + number);
		String myString = "Today is Wednesday and it is Java Class";
		String[] array = myString.split(" ");
		int words = array.length;
		System.out.println("Total words in String " + myString + " = " + words);

	}

}
