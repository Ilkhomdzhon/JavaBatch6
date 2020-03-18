package com.syntax.class04;

public class HW27 {

	
	]import java.util.Scanner;

	class Main {
	 public static void main(String[] args){
	   Scanner tab=new Scanner(System.in);
	   System.out.println("Please enter your age");
	   int age=tab.nextInt();
	   
	   if(age>=18){
	     System.out.println("You are eligible to vote");
	     
	   }else{
	     System.out.println("Your are not eligible to vote");
	     
	   }
	 }

	}
}
