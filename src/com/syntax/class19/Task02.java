package com.syntax.class19;

public class Task02 {
	
//Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
		//Instance variables are being initialized
		//Both Constructors are being executed
	String bookName;
	int printingYear;
	public Task02 () {
		System.out.println("The below line shows a book information.");
	}
	public Task02 (String bookName, int printingYear) {
		this();
		this.bookName = bookName;
		this.printingYear = printingYear;
	}
	public void displyInfo() {
		System.out.format("The book was printed in %d.\n",bookName, printingYear);
	}
	public static void main(String[] args) {
		Task02 obj = new Task02("The war",1998);
		obj.displyInfo();
	}
}


