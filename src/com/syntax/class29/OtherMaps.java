package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
				//// Store student ID and corresponding name 
		       //// LinkedHashMap- preserves the insertion order 
		
						Map<Integer,String>lmap=new HashMap<>();
						
		 lmap.put(1000, "John Smith");
		 lmap.put(1001, "Jane Smith");
		 lmap.put(1002, "Faisal Sakhi");
		 lmap.put(1003, "Ali Tarlaci");
		 
		  System.out.println(lmap);
		  System.out.println("----------------------------------------------------------------");
		  
		  // store object in a form of K and V and you want to sort your keys is Ascending order 
		  
		   Map<Integer,String >tmap=new TreeMap<>();
		  
		   tmap.put(1000, "John Smith");
		   tmap.put(1001, "Jane Smith");
		   tmap.put(1002, "Faisal Sakhi");
		   tmap.put(1003, "Ali Tarlaci");
			 
		   System.out.println(tmap);
		   
		  //// creat map of Country and population and sort countries in Alphabetical order 
		   
		   Map<String,Integer> pop=new TreeMap<>();
		   
		   pop.put("USA", 33000000);
		   pop.put("Kazakstan", 18000000);
		   pop.put("Tajikistan", 9000000);
		   pop.put("Afganistan", 37000000);
		   
		   System.out.println(pop);
		  
	}

}
