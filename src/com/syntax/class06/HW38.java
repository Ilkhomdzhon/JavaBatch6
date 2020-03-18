package com.syntax.class06;

import java.util.Scanner; 

public class HW38 {
//	
//	For you to do:
//		Prompt user with a question: "Is it weekend?"
//		If it is not a weekend --> subject="Manual testing"
//		Otherwise --> subject="Java"
//
//		Output: 
//		"Today you will be learning ____"
//	
	
	  public static void main(String[] args) {
	   
		  Scanner Scan = new Scanner (System.in);
		  
	    System.out.println("Is it Weekend ?");
	    String day = Scan.nextLine();
	    String subject ;
	    
	    
	    
	    
	    
	    if (day.equals("yes")|| day.equals("true")) {
	    	subject="Java";
	    
	    }else {
	    	subject="Manual testing";
	    }
	    
	    System.out.println("Today you will be learning "+subject);
	    
	    
	  }

	}
	
	
	

