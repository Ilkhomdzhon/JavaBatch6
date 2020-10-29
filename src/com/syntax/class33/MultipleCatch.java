package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatch {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir")+"/congfigs/";
		
		try {
			FileInputStream fis=new FileInputStream(file);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

	}

}
