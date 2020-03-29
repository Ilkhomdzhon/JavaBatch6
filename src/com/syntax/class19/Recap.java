package com.syntax.class19;

public class Recap {
	
	
	Recap (){
		System.out.println("Constructor with no argument ");
		
	}
	
	Recap (int num ){
		System.out.println("Constructor with one Parameter");
		
	}
       public static void main(String[] args) {
    	   Recap obj=new Recap(2);
    	   
	
  }
}
