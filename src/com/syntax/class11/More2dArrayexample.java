package com.syntax.class11;

public class More2dArrayexample {
	
	
	public static void main(String[] args) {

		//lets create 2D array in which we store professions
		
		String[][] professions= {
				{"QA Tester", "Developers", "Product Owner", "Scrum Master"},
				{"Math Teacher", "Science Teacher", "ESL Teacher"},
				{"Dentist", "Surgeon"}
		};
		
		//get elements using advanced for loop
		
		for(String[] occupation:professions) {
			for(String title:occupation) {
				System.out.print(title+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("======USING NESTED LOOP TO RETRIEVE VALUES");
		
		for (int i=0; i<professions.length;i++) {
			for (int y=0; y<professions[i].length; y++) {
				
				System.out.print(professions[i][y]);
				
			}
			System.out.println();
		}
		
	}
}




