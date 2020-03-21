package com.syntax.class11;

public class Task01 {

	public static void main(String[] args) {
		
//		Create an array of cars : american, german, korean, italian. 
//		Then retrieve all values from that array using 2 different loops

		
		 String[][] cars = {
				 {"Dodge ","GMC","Ford","Chevrolet"},
				 {"Mercedes","Opel","BMW","Caravan"},
				 {"Toyota","Mazda","Suzuki"},
				 {"Pegeo","Lada","Vaz 21-06","Moskvich"}
		 
		                  };
		
		        int total =0;
				 for (int c=0; c<cars.length; c++) {
			 for (int r=0; r<cars[c].length; r++) {		 
				 System.out.print(cars[c][r]+" ");
				 total ++;
			 }
			 System.out.println();
			 
			 System.out.println("****Total number of cars is ****="+total);
			 
		 }
		 System.out.println("===USING ADVANCED FOR LOOP");
		 
		 for (String[] car:cars) {
			 for (String model:car) {
				 
				 System.out.print(model+" ");
				 
			 }
			 System.out.println();
		 }
	}
}

	
		 