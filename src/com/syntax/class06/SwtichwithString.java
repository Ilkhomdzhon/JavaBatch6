package com.syntax.class06;

import java.util.Scanner;

public class SwtichwithString {

	public static void main(String[] args) {

		/*
		 * ask a user where he or she is from based on the country we will define
		 * favorite food
		 * 
		 * Your favorite food is __________
		 * 
		 */

		Scanner scan;
		String country;
		String favoriteFood;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country ");
		country = scan.nextLine();

		switch (country) {

		case "Morocco":
			favoriteFood = "couscous";
			break;

		case "Belarus":
			favoriteFood = "Potato";
			break;

		case "Tajikistan":
			favoriteFood = "osh";
			break;

		case "Turkey":
			favoriteFood = "baklava";
			break;

		case "Afganistan":
			favoriteFood = "Mantu";
			break;

		case "Kazakstan":
			favoriteFood = "Beshparmak";
			break;
           
		default :
			favoriteFood="Unknown";
			
		}
 System.out.println("Your favorite food is "+favoriteFood);
 
	}

}
