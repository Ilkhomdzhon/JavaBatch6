package com.syntax.class15;

public class MethodsReturningValues {

	public static void main(String[] args) {
		
		/// create a String and based on the length of the String 
		// we define whether String is short or long 
		
		String str="Hello my friend ";
		int length =str.length();
		
		if (length>10 ) {
			System.out.println("String is long ");
			
		}else {
			System.out.println("String is short");
		}
		
		///**** compare 2 numbers and then we will identify whether largest is even or odd ?*******
		
		Methods obj=new Methods();
		// int num=obj.islargest(10,20) ; CE since isLargest does not return any value
		//
		//int num = obj.largest(12,13);
		
		
		MethodsReturningValues newObject=new MethodsReturningValues();
		int num = newObject.largest(12,13);
		boolean flag=newObject.isOdd(num);
		System.out.println("Largest number "+num+" is odd number "+flag);
	}
	
	// Create a method that returns largest numbers from 2 given numbers 
	
	int  largest (int a ,int b) {
		int largest ;
		if (a>b) {
			largest =a;
			
		}else {
			largest=b;
			
		}
		return largest;
		
		
	}
	
	boolean isOdd(int num) {
		boolean isOdd;
		
		if (num%2==0) {
			isOdd=false;
			
		}else {
			isOdd=true;
			
		}
		return isOdd;
		
	}
	

}
