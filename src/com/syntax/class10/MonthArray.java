package com.syntax.class10;

public class MonthArray {
	
	public static void main(String[] args) {
	
		String [][]month= {
			{"January","February","December","Hi","Hello"},
			{"March","April","May"},
			{"June ","July","August","Monkey"},
			{"September","October","November"}
			
			
	          };
		
		System.out.println("+++++++++++++==========================+++++++++++++++++");

	       int rows =month.length;// how many array
	       int firstArray=month[3].length;
	       System.out.print(firstArray);
	 
            for (int i=0 ; i<month.length;i++) {/// iterates over rows 
            	for (int j=0; j<month[i].length;j++) { // iterates over columns
            		
            		System.out.println(month[i][j]);
            	}
	 
 }
      }
}	 


