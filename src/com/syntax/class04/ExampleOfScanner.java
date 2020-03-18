package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScanner {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		String text=scan.nextLine();
		System.out.println(text);
		System.out.println("I understood"+" "+"But still some confusion");
		
		
		int num=scan.nextInt();
		System.out.println(num);
		
		System.out.println("I understood scanner for %"+num);
		
		long num1=scan.nextLong();
		System.out.println(num1);
		
		System.out.println("I still have confusion for  "+num1);
		
		boolean bool=scan.nextBoolean();
		System.out.println(bool);
		
		System.out.println("If I don't understand "+bool);
		
		byte by=scan.nextByte();
		System.out.println(by);
		
		System.out.println("I have confusion of "+by);
		
		float floa=scan.nextFloat();
		System.out.println(floa);
		
		System.out.println("This is float"+floa);
		
		String wholetxt=scan.next();
		System.out.println(wholetxt);
		
		System.out.println("Please Enter your name "+wholetxt);
				
		

	
		
		
	}

}
