package com.syntax.class08;

import java.util.Scanner;

public class Task04 {



	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String creditCard=null;
		 for (int i = 1; i <= 10; i++) {
	            System.out.println("Would like to apply for a credit card");
	            creditCard= input.nextLine();
		if (creditCard.equalsIgnoreCase("Yes")) {
            System.out.println("Congrats!");
            break;
		}
	}
	}
}











