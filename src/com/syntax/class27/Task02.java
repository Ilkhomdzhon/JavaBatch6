package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task02 {

	public static void main(String[] args) {
  //Create an arrayList of words. Remove every word that ends with “e”. Use iterator
		ArrayList<String> words=new ArrayList<>();
		words.add("book");
		words.add("apple");
		words.add("good");
		words.add("lodge");
		
		
		Iterator<String> itr=words.iterator();     // using iterator
		while(itr.hasNext()) {
			String str=itr.next();
			if(str.endsWith("e")){
				itr.remove();
			}
		}
		System.out.print(words);
	}
}