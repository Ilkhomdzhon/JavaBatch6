package com.syntax.class04;

import java.util.Scanner;

public class Example21 {
	
	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please Enter your name ");

        String name=scan.nextLine();
        System.out.println(name);
        
        
       System.out.println("Please Enter your phone number");
       
       long phone=scan.nextLong();
       System.out.println(phone);
       
       System.out.println("My phone number is "+phone);
        
	}

}
