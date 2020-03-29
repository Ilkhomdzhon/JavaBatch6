package com.syntax.class18;

public class USA {

	
	/// create variables to hold states and capital of the state 
	  
	 String state ,stateCapital;
	 
	  //// create  method to display state and stateCapital 
	 
	  public void  display() {
		
		  System.out.println(state+"and it's capital is "+stateCapital);
	  }
	
	   /// create a Constructor that will initialize instance variables 
 	  
       public USA(String state , String StateCapital) {
    	  this.state=state;
    	   this.stateCapital=StateCapital;
    	   
    	   
       }
       public static void main(String[] args) {
		
    	   USA usa= new USA("Virginia "," Richmond");
    	   usa.display();
    	   
	}
     	   
}
