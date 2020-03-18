package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		
		//Create an array on integers and 
				//calculate the sum of all integer elements in an array.
				int[] num= {10, 20, 30, 40, 50, 60,70};
				int sum=0;
				for(int i:num) {
					sum+=i;
				}
				System.out.println(sum);
		
		
	}

}
