package com.syntax.class06;

import java.util.Scanner;

public class AllinOne {

	public static void main(String[] args) {
		
		/*write a program to ask user  if there is sale 
		 *  if there is no sale ---> not going to shopping 
		 *  if sale we will ask the price of the item 
		 *  based on the price we will apply discount and calculate final price 
		 *  
		 *  if price less than 20 --> apply 10%
		 *  if price btw 20 and 100 --> apply 20%
		 *  if price btw 100 and 500 --->apply 30%
		 *  if price more than 500 -->apply 50 % * 
		 *  
		 *  after discount ___the price of the item reduced from____to___ ?
		 */
		

		
		
		Scanner scan1;
		String sale ;
		double price ;
		double discount;
		double finalPrice;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there sale");
	     sale = scan.next();
		
		
		
		if (sale.equalsIgnoreCase("Yes")){
			System.out.println("What is the price");
		     price=scan.nextDouble();
		    
		if (price<=20) {
			discount=price*0.1;
			
		
		}else if (price>20 && price<=100) {
			discount=price*0.2;
			
		
		}else if (price>100 && price<=500) {
			discount=price*0.3;
			
		
		}else  {
			discount=price*0.5;
			
			
		}
		finalPrice=price-discount;
			System.out.println("After "+discount+"discount the price of the item reduced from "+price+" to "+finalPrice);
		
		}else
			System.out.println("I am not going shopping");
		}
		
			
		

}


