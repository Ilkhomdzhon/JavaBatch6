package com.syntax.class11;

public class Task02 {

	public static void main(String[] args) {
//		Create an array of countries: north america countries, south america countries, 
//		europe countries, asian countries, african countries. 
//		Then print all values from that array using 2 different loops and calculate 
//		how many total 
//		countries been stored.
		
		
		String [][] continents= {
				{"Bahamas", "Barbados", "Belize"},
				{"Chile", "Colombia", "Ecuador"},
				{"Sweden ","Poland","Switzerland"},
				{"China ","Malaysia","Thailand"},
				{"Kenia","Nigeria","Ghana"}

		};
            int total =0;
		for (int r=0 ; r<continents.length; r++) {
			for (int c=0; c<continents[r].length; c++) {
				System.out.print(continents[r][c]+" ");
				total ++;
			}
			System.out.println();
	}
	 System.out.println("Total "+total);
		System.out.println("=========Using advanced loop +========================");
		
		for (String[] continent:continents) {
			for (String country:continent) {
				
				System.out.print(country+" ");
				
				
	}
			System.out.println();
}
}
}