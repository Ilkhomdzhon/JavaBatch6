package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

//		Ask user to enter their country and capture it.
//		Once values are captured print which language user speaks.

		
		String language = null ;
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the coutnry that you from ?");
		String country = scan.nextLine();
		
		switch (country) {
		 
		case "Bangladesh":
		language = "Bengali";
			break;
		
		case "Tajikistan":
			language="Tajik";
    	break;
    	
		case "United States ":
             language="English";
           break;
           
             default:
            	 System.out.println("Ask administrator to enter your country ");
            	 
             break;
             
		
		}

		System.out.println("Your language is "+ language);

	}

}
