package com.syntax.class06;

import java.util.Scanner;

public class HW41 {

	public static void main(String[] args) {
//		Write a program using the switch statement  
//		Let us consider the scenario regarding the born baby age
//		First Output: "enter the age of the Child"
//		case 1: if age is 1 print as "You can Crawl"
//		case 2 : if age is 2 print as  "You can Talk
//		case 3: If age is 3 print as "You can Dance
//		case 4: if age is 4 print as "You can get  Trouble"
//		Other than this age (1-4) it should print "I don't know how old you are" 
//		
		Scanner scan;
		String child;
		int age;

		scan = new Scanner(System.in);
		System.out.println("enter the age of the child ");
		age = scan.nextInt();

		switch (age) {

		case 1:
			child = "You can Crawl";
			break;

		case 2:
			child = "You can Talk";
			break;

		case 3:
			child = "You can Dance";
			break;

		case 4:
			child = "You can get Trouble";
			break;

		default:
			child = "I don't know how old are you ";

		}

		System.out.println(child);

	}

}
