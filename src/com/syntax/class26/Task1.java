package com.syntax.class26;

public class Task1 {
	
//	Create Registration Class in which you would have variables as email, 
//	userName and password that have an access scope only within its own class. 
//	  After creating an object of the class user should be able to call methods and in
//	  each method separately pass values to set users email, username and password. 
//	  
//	Requirements: 
//
//	Valid email consider to be only yahoo
//	Valid userName and password cannot be empty and should be of length larger 
//	  than 6 characters. Also valid password cannot contain userName.

	private String email;
	private String userName;
	private String pasword;
	
	public void setEmail(String email) {
		if (email.isEmpty()) {
			if (email.contains("yahoo")) {
				this.email=email;
			}else {
				System.out.println("email should contain yahoo only");
			}
			
		}else {
			System.out.println("email can not be empty");
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		