package com.syntax.class15;

public class CreatingMethod {
	
	//we want to create a method that will accept marks(90, 80)
		//based on the marks it will return grade(A, B, C)
		//if grade >90-->A, if 90<grade>80-->B, if 80<grade>70-->C
	
	String marks(int num) {
		String marks;
		if (num>90) {
			marks="A";
		}else if (num>=80 || num<90) {
			marks="B";
		}else if (num>=70 || num<80) {
			marks="C";
		} else {
			marks="D";
		}
		return marks;
	}
	public static void main(String[] args) {
		CreatingMethod grade= new CreatingMethod();
		// TODO Auto-generated method stub
		String result=grade.marks(90);
		System.out.println("Your grade is : "+result);
	}
}
	
	


