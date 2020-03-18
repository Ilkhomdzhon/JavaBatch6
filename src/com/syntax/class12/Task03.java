package com.syntax.class12;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		


Scanner sc=new Scanner (System.in);
		
String babyName = null;
		String input;
		String input1;
		String input2;
		System.out.println("Mom's firstName ? ");
		input=sc.next();
		System.out.println("Dad's firstName ? ");
		input1=sc.next();
		System.out.println("Boy or Girl? ");
		input2=sc.next();
		if (input2.equalsIgnoreCase("boy")) {
			babyName=(input1.substring(0, (input1.length()/2) ))+(input.substring((input.length()/2) ));
		}else {
			babyName=(input.substring(0, (input.length()/2) ))+(input1.substring((input1.length()/2) ));
		}
		System.out.println(babyName.toUpperCase());
		
		
		
		
		
	}

}
