package com.syntax.class05;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
//		
//		Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
//			if the average score >=90 → grade=A
//			if the average score >= 70 and <90 → grade=B
//			if the average score>=50 and <70 → grade=C
//			if the average score<50 → grade=F

		String grade;
		int quiz;
		int midTerm;
		int finalScore;
		int averageScore;
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter quiz score");
		 quiz = scan.nextInt();
		
		
		
		System.out.println("Please enter mid term score");
		midTerm = scan.nextInt();

		System.out.println("Please enter Final");
		finalScore = scan.nextInt();
		
		averageScore=(quiz+midTerm+finalScore)/3;
		

		if (averageScore >= 0 && averageScore <= 50) {
			grade = "F";

		} else if (averageScore >= 51 && averageScore <= 70) {
			grade = "C";

		} else if (averageScore > 71 && averageScore<= 90) {
			grade = "B";

		} else {
			grade = "A";
			
		}
		System.out.println("Your grade is " + grade);

	}

}
