package com.syntax.class25;

public interface WebDriver {
	
//Create a WebDriver Interface that will have the following unimplemented behavior: 
//	openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
//	 Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

	
	 
	 void openBrowser();
	 void  closeBrowser();
	 void maximizeWindow();
	 void findElement();
	 
	
	 
} class ChromeDriver implements WebDriver{


	@Override
	public void openBrowser() {
		System.out.println("Open Chrome");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find element within Chrome");
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Open it ");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close it ");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize it ");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find it ");
		
	}
	
}

