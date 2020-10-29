package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
      /// write into existing file and add value 
		
 String filePath = "/Users/ilkhomdzhonishonkulov/eclipse-workspace/JavaBasics/configs/Examples.properties";

  FileInputStream fis= new FileInputStream(filePath);
  
  	Properties prop=new Properties();
   
  	prop.load(fis);
  	
  	 prop.setProperty("phoneNumber", "3474018515");
  	 
  	  FileOutputStream fos=new FileOutputStream(filePath);
  	   
  	   prop.store(fos, "Added additional key");
  	   
  	  
  
  
  
	}

}
