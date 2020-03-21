package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		String[][] groceries= {
				{"cucumber","potatos","carrot"},
				{"mango","apple","banana","kiwi"},
				{"milk","cheese","yogurt"}
		           };
		
		System.out.println(groceries[1][2]);// retrieve banana 
		
		  // how to retrieve all values from 2d array 
	
		   /// loop through rows
		 for (int r=0; r<groceries.length; r++) {
			 /// loop through column
			 for (int c=0;c<groceries[r].length;c++) {
				 
				 System.out.print(groceries[r][c]+" ");
				 
			 }
			   System.out.println();
			
		 }
		 
 System.out.println("======GETTING ELEMENTS USING ADVANCED FOR LOOP=======");
 
 // loops through all arrays 
       for (String[] array:groceries) {
    	   
    	   // loops through each single array
    	   for (String items:array) {
    		   
    		   System.out.print(items+" ");
    	   }
    	   System.out.println();
    	   
       }
		
		
	}
}