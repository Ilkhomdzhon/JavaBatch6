package com.syntax.class10;

public class HW02 {

	public static void main(String[] args) {
//Create a 2D array that first row will contain 4 names and second row will contain grades. 
//Then you program should print name of the students that has A and B grade
		
		String[][] students = {{"Saif","Umed","Tetteh","Anshuman"},
				              {"A","A","B","B"}
				              
		                                    };
		System.out.println(students[0][1]+": "+students[1][0]);
		 System.out.println(students[0][0]+": "+students[1][3]);
		 System.out.println(students[0][2]+": "+students[1][2]);
		 System.out.println(students[0][3]+": "+students[1][1]);
	}

}
