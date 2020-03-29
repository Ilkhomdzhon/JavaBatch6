package com.syntax.class19;

public class ThisKeyword {
	
	
	int a ;
	int b ;
	
	public ThisKeyword() {
		System.out.println("Im non argument");
	}
	
	public ThisKeyword(int a ,int b) {
		this.a=a ;
		this.b=b;
		
	}
	
	public void sum (int a ,int b) {
		// sum of which variables am I calculating ?
		System.out.println("calculates local variable "+(a+b)); ///     ******  calculates local variable 
		System.out.println("calculates instance variables "+(this.a+this.b));// ****** calculates instance variables 
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(10,20);
		obj.sum(100,200);
		
		System.out.println("-----------------------------");
		ThisKeyword obj1=new ThisKeyword();
		obj1.sum(20, 40);
	}

}
