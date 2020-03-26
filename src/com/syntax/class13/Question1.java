package com.syntax.class13;

public class Question1 {

	public static void main(String[] args) {
		
		/*
 		 * Write a program to swap 2 numbers without a temporary variable? Swap 2
 		 * strings without a temporary variable?
 		 */

 		int a =15 ;
 		int b =10 ; 
 		
 		a=a+b; //15+10 =25  now a=>25
 		b=a-b; //25-10= 10 now b=>15
 		a=a-b ;

 		System.out.println("The value of a = " +a);
 		System.out.println("The value of b = " +b);

 		String str1="Day";
 		String str2="Night";

 		str1=str1+str2;
 		str2=str1.substring(0, str1.length()-str2.length());
 		str1=str1.substring(3);

 		System.out.println("The value of ****str1 = "+str1);
 		System.out.println("The value of ****str2 = "+str2);
 		

 		//another way
 		String s1="Hello";
 		String s2="Bye";

 		String shorterstr1 = s1+s2;
 		s2 = shorterstr1.replace(s2, "");
 		s1 = shorterstr1.replace(s2, "");

 		System.out.println("The value of s1 = "+s1);
 		System.out.println("The value of s2 = "+s2);

 	
 
		
	}

}
