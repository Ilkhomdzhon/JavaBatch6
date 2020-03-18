package com.syntax.class09;

public class Pattern {

	public static void main(String[] args) {
/////// ROWS CONTROL BY OUTER LOOP ---
		////COLUMN CONTROL BY INNER LOOP||||
		
		for (int r=1;r<=4;r++) {
			for (int c=1;c<=5;c++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

		System.out.println("=================================================");
		
		for (int i=0; i<=10;i++) {
			for (int y=0;y<10;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=================================================");
		
		
		for (int i=0; i<=5;i++) {
			for (int y=0;y<5;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
