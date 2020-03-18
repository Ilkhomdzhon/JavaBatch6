package com.syntax.class11;

public class Task01 {

	public static void main(String[] args) {
		
//		Create an array of cars : american, german, korean, italian. 
//		Then retrieve all values from that array using 2 different loops

		String [][] cars= {
				{"Dodge","Mustang","Chrisler"},
				{"Opel","Caravan","Sedan"},
				{"Mitsubishi","Mazda","Toyota"},
				{"Citroen","Suzuki","Pegeou"}
		};
		   
		for (int r=0 ; r<cars.length; r++) {
			for (int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+" ");
			}
			System.out.println();
			
		}
		System.out.println("=========Using advanced loop +========================");
		
		
		for (String[] car:cars) {
			for (String model:car) {
				
				System.out.print(model+" ");
			}
			System.out.println();
		}
		
	}

}
