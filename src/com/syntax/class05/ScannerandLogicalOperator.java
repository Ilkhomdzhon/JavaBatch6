package com.syntax.class05;

import java.util.Scanner;

public class ScannerandLogicalOperator {

	public static void main(String[] args) {
		/* Take age input from a user and then based on the age print output
		 * if age is from 0--3 --> you are a baby
		 * if age is from 4--5 --> you are a kid 
		 * if age is from 6-12 -->you are a child 
		 * if a age is from 13-19 -->you are a teenager 
		 * if age from 20-64-->You are an adult 
		 * if age is more or equal to 65 -->you are a senior
		 * 
		 */

		//1-let's declare all variables 
		int age ;
		Scanner scan; // to import we use cmd+shift+o--->short cut
		
		//2- capture values 
		scan = new Scanner(System.in);
		System.out.println("Please enter your age ");
		age = scan.nextInt();
		
		//3 -perform verification 
		
		if (age >=0 && age<=3) {
			System.out.println("You are a baby");
			
		}else if (age>=3 && age<=5) {
			System.out.println("You are a kid ");
		}else if (age>=6 && age <=12) {
			System.out.println("You are a child");
		}else if (age>=13 && age<=19) {
			System.out.println("You are a teenager");
		}else if (age>=20 && age<=65) {
			System.out.println("Your are an adult");
		}else {
			System.out.println("Your are enjoying your life");
		}
		
		                     
	}

}
