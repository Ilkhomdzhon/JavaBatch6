package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
		
		String[] animalNames= {"Tiger","Lion", "Elephant", "Jaguar"};
		
		for (String name: animalNames) {
			System.out.println(name+" ");
		}
		System.out.println("====2nd for loops============");
		for(int row=0;row<animalNames.length;row++) {
			System.out.print(animalNames[row]+", ");
		}
		System.out.println();
		
		
	

}
}

