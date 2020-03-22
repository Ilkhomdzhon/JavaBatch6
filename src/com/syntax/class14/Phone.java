package com.syntax.class14;

public class Phone {

	
//	Create a Class “Phone”. Create 3 Objects of it: 
//    iPhone, Android, Nokia with specific  
//    attributes and behaviors.
	
	String brand ;
	String color ;
	int year ;
	String model;
	
	
	public static void main(String[] args) {
		
		Phone phone1 =new Phone();
		
		phone1.brand="Iphone";
		phone1.color="Silver";
		phone1.model="XR";
		phone1.year=2019;
		
		
		phone1.call();
		phone1.music();
		phone1.text();
		
      Phone phone2 = new Phone();
		
        phone2.brand= "Nokia";
		phone2.color="Black";
		phone2.model=" Nokia C5";
		phone2.year=2019;
		
		phone2.call();
		phone2.music();
		phone2.text();
		
		
	}
	void call(){
		System.out.println(brand+" can call");
			
	}
	void music() {
		System.out.println(brand+" can play music");
		
	}
	void text() {
		System.out.println(brand+" can text message ");
		
	}
}
