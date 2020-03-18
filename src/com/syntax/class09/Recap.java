package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
//		for (int i=1 ; i<=3; i++ ) {
//			for (int j=1; j<=3 ; j++) {
//				System.out.println(i+" "+j);
//				
//			}
//		}
//		
//		System.out.println("========================================================");
//		//// using nested loop to print 10 to 99 
//		
//		for (int i=1 ; i<=9 ; i++) {
//			for (int y=0 ; y<=9 ; y++) {
//				System.out.println(i+" "+y);
//			}
//		}
		

		System.out.println("===================Clock =====================================");
		
		for (int h=0;h<=24;h++) {
			
			for (int m=0;m<=59;m++) {
				
				
				System.out.println(h+":"+m);
			}
			
		}
		
		System.out.println("===================Spedometer =====================================");
		
		for (int a=0; a<10; a++) {
			for(int b=0; b<10;b++) {
				for (int c=0;c<10;c++) {
					for(int d=0;d<10;d++) {
						
						System.out.println(a+" "+b+" "+c+" "+d);
					}
				}
			}
			
		}
		
	}

}
