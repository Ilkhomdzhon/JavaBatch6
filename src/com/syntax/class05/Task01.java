package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		int height;
		int inches;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age in heights in inches");
		height=scan.nextInt();
		
		if (height>=0 && height<=60){
			System.out.println("Yor are short");
		}else if (height>=61 && height<=72) {
			System.out.println("You are Medium");
		}else {
			System.out.println("You are Tall");
		}
		
		
		
		
		
	}

}
