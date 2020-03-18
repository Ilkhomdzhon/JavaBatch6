package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogic {

	public static void main(String[] args) {
		
		/* You are a saleman
		 * ask a user for how much his sales are 
		 * based on the amount of sales we need to calculate his comission
		
		 * if sales is between 1-100 --> commision should be 10%
		 * if sales is between 100-200 -->commision should be 20%
		 * if sales is between 200 -500 --> commision should be 30%
		 * is sales more 500 --> commision should be 50%
		 * 
		 * if your sales are 200 ------->40$
		 */

		// 1 . declare all variables that I will need 
		Scanner scan;
		double sales;
		double commision;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble();
		
		if( sales>=0 && sales<=100) {
			// give user 10% commision
			commision=sales*0.1;
			
		}else if ( sales>100 && sales<200) {
			//give user 20% commision
			commision=sales*0.2;
			
		}else if ( sales>200 && sales<500) {
			//give user 30% commision
			commision=sales*0.3;
			
		}else{
			commision=sales*0.5;
			
		}
		System.out.println("Based on your sales your commision is ="+commision);
			
		}
	}



	 
			
		
		
		
		
	


