package com.syntax.class08;

public class Task02 {

	public static void main(String[] args) {
		
		// write a program that print numbers from 1 to 20 
		//I don't want to print 5,6,7
		
		
		for (int i=1 ; i<21 ; i++) {
			if (i==5||i==6 || i==7|| i==16) {/// if you don't want to write numbers 
				
				continue;
				
				
			}
			System.out.println(i);
		}

		for (int i =1;i<=100 ; i++) {
			
			if (i>=35 && i<=55) {// ///// if you don;t want to print between 35 to 55 example
				continue ;
			}
			
			System.out.println(i);
		}
		
		
		
	}

}
