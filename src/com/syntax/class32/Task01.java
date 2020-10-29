package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task01 {

	public static void main(String[] args) throws IOException {
		

		String filePath="/Users/ilkhomdzhonishonkulov/Desktop/Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		 
		
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet2");
		
		int rows=sheet.getPhysicalNumberOfRows();
		
		int colums=sheet.getRow(0).getLastCellNum();
		
		
		for (int i=0;i<rows;i++) {
			for (int y=0;y<colums;y++) {
				
				String celVal=sheet.getRow(i).getCell(y).toString();
				
				System.out.println(celVal+ " ");
				
			}
			          System.out.println();
		}
		
		
	}

}
