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
	          int sum  =0 ;
            
	          for (int i=0 ; i<continents.length;i++) {
	        	  for (int y=0 ; y<continents[i].length;y++) {
	        		
	        		  System.out.println(continents[i][y]);
	        		  sum++;
		        	  
	        		  
	        		  
	        	  }
	        	  System.out.println(sum);
	        	 
	          }
	          System.out.println("==using advanced for loop ");
	          
	           int count =0;
	           
	          for (String[]continent:continents) {
	        	  for (String countries:continent) {
	        		  
	        		  System.out.print(countries+ " ");
	        		  count++;
	        	  }
	        	  System.out.println();
	          }
	          
	        	  System.out.println(count+"");
	          }
}
