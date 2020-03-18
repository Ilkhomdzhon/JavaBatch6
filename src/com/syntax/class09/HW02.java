package com.syntax.class09;

public class HW02 {

	public static void main(String[] args) {
		
//		Create an array of names and store all names of your group. 
//		Then print your name from that array. 
//		(use 2 different ways of creating an array).

		String[] array=new String[6];
		
		array[0]="Sayf";
		array[1]="Anshuman";
		array[2]="Umed";
		array[3]="Faisal";
		array[4]="Me";
		array[5]="Ahmad";
		
		
		System.out.println(array[0]);
		
		System.out.println("==========Another way========================");
		
		String[] students={"Sayf","Anshuman","Umed","Faisal","Me","Ahmad"};
		
		System.out.println(array[2]);
	}

}
