package com.syntax.class24;

public abstract class Program {
	
//Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. Create 3 subclasses: 
//	 JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
//		 Example: to open .java file we need notepad++ or sublime text, to open .doc 
//		    file we need Microsoft word to be installed etc

	
	
	public void edit() {
		System.out.println("File can be edited");
	}
	
	public void close() {
		System.out.println("File can be closed ");
	}
	
	public abstract void toOpen();
	
	public abstract void openDoc();
}

    
 

class JavaFile extends Program{

	@Override
	public void toOpen() {
		System.out.println("to open .java file we need notepad++ or sublime text");
		
		
	}

	@Override
	public void openDoc() {
		
		
	}
	
		
}

class WordFile extends Program{

	@Override
	public void toOpen() {
		System.out.println("to open .docfile we need Microsoft word to be installed ");
		
		
	}

	@Override
	public void openDoc() {
		
		
	}
	
class PDFFile extends Program{

		@Override
		public void toOpen() {
			
			System.out.println("PDF should be installed ");
			
			
		}

		@Override
		public void openDoc() {
			
			
		}
		
	}
	
}

