package com.syntax.class10;

public class Task03 {

	public static void main(String[] args) {
		
		//Create an array of countries. 
				//While retrieving all values from an array print capital for each country. 
				//(use 2 different loops).
				String[] countries= {"Bangladesh", "USA", "India", "Pakistan"};
				String capital = null;
				System.out.println("===1st Loop=====================");
				for(String name: countries) {
					if(name.equals("Bangladesh")) {
						capital="Dhaka";
					}else if(name.equals("USA")) {
						capital="Washington DC";
					}else if(name.equals("India")) {
						capital="New Delhi";
					}else if(name.equals("Pakistan")) {
						capital="Islamabad";
					}else {
						capital="unknown";
					}
					System.out.println("The capital of "+name+" is "+capital+" ." );
				}
				System.out.println("===2nd Loop=====================");
				for(int i=0;i<countries.length;i++) {
					if(countries[i].equals("Bangladesh")) {
						capital="Dhaka";
					}else if(countries[i].equals("USA")) {
						capital="Washington DC";
					}else if(countries[i].equals("India")) {
						capital="New Delhi";
					}else if(countries[i].equals("Pakistan")) {
						countries[i]="Islamabad";
					}else {
						capital="unknown";
					}
					System.out.println("The capital of "+countries[i]+" is "+capital+" ." );
				}
		
				
//				System.out.println("===3nd Loop=====================");
//				
//				String[] countries = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
//				for (int y = 0; y < countries.length; y++) {
//				            switch(countries[y]) {
//				            
//				            case "USA":
//				                System.out.println("The capital is Washington DC");
//				                break;
//				            case "Poland":
//				                System.out.println("The capital is Warsaw");
//				                break;
//				            case "Ukraine":
//				                System.out.println("The capital is Kiev");
//				                break;
//				            case "Turkey":
//				                System.out.println("The capital is Ankara");
//				                break;
//				            case "Spain":
//				                System.out.println("The capital is Madrid");
//				                break;
//				            }
//				            
//				        }
			















				


	
	
	}
		
	}


