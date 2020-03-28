package com.syntax.class18;

public class TASK2 {
	
	
	/*Create a method that will take a String as a 
	 * parameter and returns reverse String. 
	 * Method should be available to all classes within your 
	 * projects and accessible by class name.
	 */
	public static String rev(String str) {
		String reverse="";
			for ( int i=str.length()-1; i>=0; i--) {
				reverse+=str.charAt(i);
			}
			return reverse;
		}
		public static void main(String[] args) {
			TASK2.rev("CoronaViruse");
			System.out.println(TASK2.rev("CoronaViruse"));
		}
}
