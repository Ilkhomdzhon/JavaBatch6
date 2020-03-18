package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	


	public static void main(String[] args) {
		
//		Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, 
//		any other grade --> Not Acceptable. 
//		
//		At the end your program should print which grade was entered by a user with explanation.		

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score");
		char point = scan.next().charAt(0);
		
		
            String equals;
            
	      	char score = 0;
	 	
	      	switch(score) {
	      	
	      	case 'A':
	      	equals="Exellent";
	      	break;
	      	
	      	case 'B':
	      	equals="Good";
	      	break;
	      	
	      	case 'C':
	        equals="Average";
	      	break;
	      		
	      	case 'D':
	      	equals="Bad";
	      	break;
	      	
	      	
	      	
	      	
	      		
	      	
	      	
	      	
	      	   default:
  	         	System.out.println("Any other is not Acceptable");
  		     return;
	      
	      	
	      	
	    	}
	      	System.out.println("Your score is "+score);
		
	}
					
	
	}

