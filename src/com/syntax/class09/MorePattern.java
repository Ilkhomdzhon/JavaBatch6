package com.syntax.class09;

public class MorePattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("=======================PRINTING PATTERN============================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);

			}
			System.out.println();
		}

		System.out.println("=======================PRINTING PATTERN   1 to 9============================");

		for (int r = 1; r <= 5; r++) {
			for (int t = 1; t <= 9; t++) {
				System.out.print(t + " ");

			}
			System.out.println();

		}

		System.out.println("=======================PRINTING PATTERN   5544332211============================");

		for (int r = 5; r >= 1; r--) {
			for (int t = 5; t >= 1; t--) {
				System.out.print(r + " ");

			}
			System.out.println();

		}
		System.out.println("=======================PRINTING PATTERN   5 to 1============================");

		
		for (int r=5 ; r>=1;r--) {
 			for (int t=5;t>=1;t--) {
 				System.out.print(t+" ");
		
		
	}
 			System.out.println();

}
	}
}