package com.syntax.class19;

public class Task01 {
	
//Write program as a Student class   that has instance variables name and address. 
//Create a constructor that will initialize those variables.
	//Print name & address of given  student using displayInfo method
	
	String name , address;
	
	public Task01(String name , String address) {
		this.name=name;
		this.address=address;
		
	}
	public void displayname() {
		System.out.println(name);
	}
	
    public void displayadress() {
		System.out.println(address);
		
	}
    
    public static void main(String[] args) {
		
    	Task01 obj=new Task01("John","14913 Rydell road");
    	obj.displayname();
    	obj.displayadress();
	}
	 

}
