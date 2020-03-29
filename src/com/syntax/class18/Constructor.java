package com.syntax.class18;

public class Constructor {

	
	 
	public Constructor() {
		System.out.println("Public Constructor");
	}
	Constructor( int num ){
		System.out.println("Default Constructor");
	}
	protected Constructor(int num ,int num1 ) {
		System.out.println("Protected Constructor");
		
	}
	private Constructor (String str) {
		System.out.println("Private Constructor");
		
	}
	public static void main(String[] args) {
		
		Constructor obj =new Constructor();
		Constructor obj1 =new Constructor(12);
		Constructor obj2 =new Constructor(12,14);
		Constructor obj3 =new Constructor("Hello");
		
		
		
		
	}
}
