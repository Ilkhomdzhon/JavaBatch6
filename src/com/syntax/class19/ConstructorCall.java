package com.syntax.class19;

public class ConstructorCall {
	
	
	public ConstructorCall () {
		System.out.println("Im non argument constructor ");
	}
	
	public ConstructorCall(String str) {
		this();
	}
	public ConstructorCall(String str ,String str1) {
			this(str);
		}
		
	
	public static void main(String[] args) {
		
		ConstructorCall obj=new ConstructorCall("Java","Love");
	}
	

}
