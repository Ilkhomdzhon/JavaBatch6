package com.syntax.class24;

public class ProgramTest {
	
	public static void main(String[] args) {
		
		
		Program prog=new JavaFile();
		prog.close();
		prog.edit();
		prog.toOpen();
		
		
		Program word=new WordFile();
		word.close();
		word.edit();
		word.toOpen();
		
//		Program pdf=new PDFFile();
//		pdf.edit();
//		pdf.close();
//		pdf.toOpen();
		
		

}
}
