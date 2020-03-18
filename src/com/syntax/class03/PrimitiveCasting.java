 package com.syntax.class03;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		// widening ,happens implicilty(automatic)
		//Narrowing happens explicitly (manual)
		
		double d=10;
		
		System.out.println(d);// 10.0
		
		
		//int i=10.99; -->compile time error saying 
		//type mismatch , cannot convert double to int (this is what system tells if you dont convert it manually)
		
		
		
		// narrowing ,explitly implementing 
		int i=(int)10.99;
		System.out.println(i);
		
		// byte -128 to 127
		 
		byte b=(byte) 1284;
		System.out.println(b);
		
		double m=1000.999;
		int m1=(int)1000.999;
		System.out.println(m1);
		
		long b1=34234234;
		byte b11=(byte)34234234;
		System.out.println(b11);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
