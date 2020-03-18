package com.syntax.class08;

public class LoopsMoreReview {

	public static void main(String[] args) {
		/// to print number from 50 to 1 
		
		for (int i=50 ; i>=1;i--) {
			System.out.println(i); 
		}
		
		//// Print odd numbers between 20 and 50 ///////////////////////PRINTTIN ODD NUMBERS 
		for (int i=20 ; i<=50 ; i++) {
			if (i%2!=0) {
				System.out.println(i);
			
			}
		}
               for (int i=21; i<=50 ; i+=2) {
            	   System.out.println(i);
               }
	
	
	//////////////// what is the output ///////////////////////
               
               int total =2;
               for (int k=1 ; k<4 ; k++) {
            	   total= total*k;
            	   
            	   
               }
               
	}

}
