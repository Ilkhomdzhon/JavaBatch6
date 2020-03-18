package com.syntax.class03;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		
		int i=10;
		int y=20;
		
		System.out.println(i>y);//false 
		System.out.println(i<y);//true
		System.out.println(i==y);//false 
		System.out.println(i!=y);//true(is 10 not equal to 20)
		
		

		System.out.println("--------------------------------------------------");
		
		double x=900.99;
		double y1= 100.99;
		
		 boolean result=x>y1;// true 900.99>100.99
		 boolean result1=x==y1; //false 
		 boolean result2=x!=y1;///true
		 
		 
		 System.out.println(result);
		 System.out.println(result1);
		 System.out.println(result2);
		 
				
	}

}
