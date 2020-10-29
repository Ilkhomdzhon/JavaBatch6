package com.syntax.class31;
 									/// shortcut for import command+shift+o
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

		/// to read the file :
		// have file
       
String filePath = "/Users/ilkhomdzhonishonkulov/eclipse-workspace/JavaBasics/configs/Examples.properties";

		/// 2. bring object of fileInputStream

		FileInputStream fileinput = new FileInputStream(filePath);

/// handle data from.properties file we need Property Class

		Properties prop = new Properties();
		prop.load(fileinput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city= prop.getProperty("city");
		System.out.println(city);
		
		String lastName=prop.getProperty("lastName");
		System.out.println(lastName);
		
		String country=prop.getProperty("country");
		
		System.out.println(country);
		
		/// getting all keys from property file 
		Set<Object> keys=prop.keySet();
		
		for (Object key:keys) {
			System.out.println(key);
		}
	
		
		 
		
		  
	}

}
