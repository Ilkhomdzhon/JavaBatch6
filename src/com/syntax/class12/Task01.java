package com.syntax.class12;

public class Task01 {

	public static void main(String[] args) {
		
String reverse = "";
        String str="Sunday";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
	

