package com.syntax.class19;

public class USA {

	String state ,stateCapital;
	
	public USA (String state ,String stateCapital) {
		
		this.state=state;
		this.stateCapital=stateCapital;
		
	}
	public void displaystate() {
		System.out.println(state);
	}
	public void displaystateCapital() {
		System.out.println(stateCapital);
	}
	
	/// Call method inside another method ------>NOTE
	public void displayInfo() {
		displaystate();
		displaystateCapital();
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		USA state1=new USA("Texas","Austin");
		///System.out.println(state1.state);
		state1.displaystate();
		state1.displaystateCapital();
		

	}
}
