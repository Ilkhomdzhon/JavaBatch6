package com.syntax.class06;

import java.util.Scanner;
                                   
public class ScannerandSwitfh {
   	public static void main(String[] args) {
		/* Ask user a gender : M or F 
		 * based on the gender will provide description
		 * 
		 */

		Scanner scan;
		char gender = 0 ; 
		String genderType;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter gender :M or F");
		
		switch (gender) {
		
		case 'M':
		genderType="Male";
		break;
		
		case 'F':
	    genderType="Female";
    	break;
	 default :
		 genderType = "Unknown";
		 
		 
	 
		
		}
		System.out.println("Your gender is "+genderType);
	}

}
