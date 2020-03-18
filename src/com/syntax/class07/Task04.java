package com.syntax.class07;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner scan;
		
        int number; 
        int luckyNumber=17;
        
        scan=new Scanner(System.in);
        
        
        do {
        	System.out.println("Enter a number 1-20");
               number=scan.nextInt();
              
               
               //if you want to limit the user to enter numbers only among 1 to 20 only use if condition
//               if (number>=20) {
//            	   System.out.println("Only 1 to 20 ");
//               }
//               
               
               
        } while (number!=luckyNumber) ;
        	System.out.println("You got the million");
        	

        
	}
        
        

	}


