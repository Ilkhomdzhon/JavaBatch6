package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		
		for (int r=1 ; r<=10 ; r++) {
			for (int c=1; c<=r; c++){
				System.out.print("$");
			}
			System.out.println();
		}
		
		
		System.out.println("================PRINTING TRIANGLE NUMBERS===================");
		
		for (int r=1 ; r<=5 ; r++) {
			for (int c=1; c<=r; c++){
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
