package com.syntax.class06;
import java.util.Scanner;
public class chechj {

	  public static void main(String[] args) {
	    
	    Scanner scan= new Scanner(System.in);
			System.out.println("Please enter 1 distinct number");
			int num1=scan.nextInt();
			System.out.println("PLease enter 2 distinct number ");
			int num2=scan.nextInt();
			System.out.println("Please enter 3 distinc number ");
			int num3=scan.nextInt();
			
			
			if (num1>num2 && num1>num3) {
				System.out.println("The largest number is "+num1);
			}else if (num2>num1 && num2>num3) {
				System.out.println("The largest number is "+num2);
			}else if(num3>num1 && num3>num2) {
				System.out.println("The largest number is "+num3);
				
			
		     } 

	   }
		}


}
