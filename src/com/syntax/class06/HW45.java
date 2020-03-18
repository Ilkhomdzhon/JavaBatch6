package com.syntax.class06;

import java.util.Scanner;

public class HW45 {
	public static void main(String[] args) {
		
		
//			Ask the user to enter any number from 1-7.
//			Based on the number define the day of the week
//			Example Output:
//			Input a number between 1-7
//			Friday
//			Example Output:
//			Input a number between 1-7
//			Invalid
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number :");
		String weekday =nextLine();
		int weekDay = scan.nextInt();
		
		
		switch(weekDay) {
		case 1 :
			weekday= "Monday";
			break;
		case 2 :
			weekday="Tuesday";
			break;
		case 3 :
			weekday="Wednesday";
			break;
		case 4 :
			weekday="Thursday";
			break;
		case 5 :
			weekday="Friday";
			break;
		case 6 :
			weekday ="Saturday";
			break;
		case 7:
			weekday="Sunday";
			break;
			
			default:
				weekday="Invalid";
				
			
				
			
		
		
				  System.out.println("The day is "+weekday);
			      
		
	}
      

	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
