package com.syntax.class06;

import java.util.Scanner;

public class HW35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num = 0;
		String loan;	
		String  eligibility = null;
		String yes ;
		
		
		
		System.out.println("Do you need a loan?");
		loan=scan.nextLine();
		
		
		    if (loan.equals("yes")) {
			System.out.println("What is your credit score?");
			num=scan.nextInt();
		
			if (num<600);{
			eligibility= "Not eligible";
			
	       if(num<=600 && num<=700){
			eligibility="Maybe eligible";		
			
		   }else if(num<=701 && num<=800) {
			eligibility="Eligible";
			
		   }else if (num>800) {
			eligibility="Definitely eligible";
			
		    
	}else  {
	  eligibility="Unknown";
			
		}
	
    System.out.println("The eligibility is  "+eligibility);
		
    }
		    }
}
}