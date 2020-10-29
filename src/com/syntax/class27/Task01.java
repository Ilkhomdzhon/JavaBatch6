package com.syntax.class27;

import java.util.ArrayList;

public class Task01 {

	public static void main(String[] args) {
		
//		Create an arraylist of cars and retrieve all the values using 3 different ways.
//
//		Create an arrayList of words. Remove every word that ends with “e”. Use iterator

		 ArrayList<String> car=new ArrayList<>();
		 
		 car.add("Moskvich");
		 car.add("Jiguli");
		 car.add("Volga");
		 car.add("Zil");
		 
		  System.out.println(car); //1st way
		  
		  for (int i=0;i<car.size();i++) {
			  System.out.print(car.get(i)+",");  //2 nd way 
		  }
		  System.out.println("+++++++++==============+++++++++++=======");
		 
		  
		  for (String cars:car) {
			  System.out.print(cars+",");
		  }
		 

		
	}

}
