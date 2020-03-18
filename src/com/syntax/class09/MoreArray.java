package com.syntax.class09;

public class MoreArray {

	public static void main(String[] args) {
//// Arrays are fixed in size (if u say 3 there should be 3 only more will give you error)
		// if we add more values then we declared (java.lang.ArrayIndexOutOfBoundsException:)
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Sayf";
		students[2]="Kemal";
		
		//students[3]="Aaron";//-->during run time java machine will give 
		       ////java.lang.ArrayIndexOutOfBoundsException
		///System.out.println(students[3]);
		
		
		// if we store less elements than we declared 
		// compiler will add default values
		
		String[] inClassStudents=new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		
		System.out.println(inClassStudents[0]);
	}

}
