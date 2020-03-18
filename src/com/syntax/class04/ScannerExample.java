package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.print("Please enter your name ");
		 
		 String name=scan.nextLine();
		 
		 System.out.print("My name is "+name);
		 
		 System.out.print(" How old are you ?  ");
		 
		 int age=scan.nextInt();
		 
		 System.out.println("My name is "+name+" I am years old "+age);
		 
		 
	}

}
