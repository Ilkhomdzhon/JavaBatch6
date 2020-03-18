package com.syntax.class07;

public class Taskclaa01 {

	public static void main(String[] args) {
	
		int num=1 ; 
		 while (num<=50) {
			 System.out.println(num);
			 num++;
			 
		 
		}
		 System.out.println("====================================================="); 
		 
		 
		 int x =1;
		while (x<20) {
			System.out.println(x);
		    x+=2;
		}
		
		
		// /2 way using mod and if condition 
		
		int  num4 =1 ; 
		while (num4 <=20) {
			if (num4 %2 !=0) {
				System.out.println(num4);
				
			}
		num4++;
		
		}
		
	
		//3 way 
		int y = 1 ;
		while (y<=20 ) {
		
			System.out.println(y++);
			y++;
			
		}
    }
}