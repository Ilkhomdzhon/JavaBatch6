package com.syntax.class03;

public class AdditionVsConcatination {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		System.out.println(a+b+x+y);// 30HelloBye
		System.out.println(a+x+b+y);//10Hello20Bye
		System.out.println(x+y+a+b);//*Hellobye1020(becuase first comes string thats why system concatinates
		System.out.println(x+y+(a+b));//HelloBye30
		//to get 1020HelloBye we use ""
		System.out.println(a+""+b+x+y);
		
		
			
		
		
		
	}

}
