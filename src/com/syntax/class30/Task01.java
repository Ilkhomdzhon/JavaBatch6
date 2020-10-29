package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Task01 {

	public static void main(String[] args) {
		
//		Create a map of Best Buy store. Place
//		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//
//		Retrieve all keys and values from a Best Buy map using EntrySet.
//
//		
		Map<Integer, String> BestBuy=new HashMap<>();
		
		BestBuy.put(7664847, "Printer");
		BestBuy.put(7879885, "TV");
		BestBuy.put(7879886, "Phone");
		BestBuy.put(7879887, "Laptop");
		
		
		Set<Entry<Integer,String>> hhh=BestBuy.entrySet();
		
		
		for(Entry<Integer, String> reh:hhh) {
			Integer key=reh.getKey();
			String value=reh.getValue();
			
			System.out.println(key+":"+value);
		}
		
		
	}

}
