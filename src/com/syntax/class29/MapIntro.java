package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
 ///   HashMap does not maintain order 
		HashMap<String,String> hmap=new HashMap<>();
		
		 // to store values into Map we use put 
		
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Adress", "123 Test");
		hmap.put("City", "Chantilly");
		
		/// how to check if map has any values ?
		
		boolean  isEmpty=hmap.isEmpty();
		
		System.out.println("Map is empty "+isEmpty);
		
		/// how many elements is MAp 
		int size =hmap.size();
		System.out.println(size);

		/// Can we add more values into Map ?
		
		hmap.put("Zip", "12345");
		
		/// Can we store duplicate Keys ?,No previous value will be replaced 
		
		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
		/// how to access the single value ?
		System.out.println(hmap.get("Name"));
		
		/// to remove the value ?
		System.out.println(hmap.remove("Adress"));
		
		/// to replace the values ?
		
		hmap.replace("Zip", "20120");
		System.out.println(hmap);
		
		
	}

}
