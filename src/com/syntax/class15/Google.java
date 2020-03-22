package com.syntax.class15;

public class Google {
	
	/// define features such as empID ,name ,last name ,salary ,title . 
	//define behaviour working ,get paid ,attending meeting . 
	
	int empID ;
    double salary ;

     String name ,Lastname,title ;
     
     void working () // method header 
     {// method body 
    	 
    	 
    	 System.out.println(title+"is working ");
    	 
     }
     void getPaid () {
    	 System.out.println(name+"is getting paid "+salary);
     }
     void attendMetting() {
    	 System.out.println(name+"attending meeting");
    	 
    	 
    	 
     }
     
      public static void main(String[] args) {
		
    	  Google emp1=new Google();
    	  
    	  emp1.empID=123;
    	  emp1.name="John";
    	  emp1.Lastname="Smith";
    	  emp1.title="CEO";
    	  emp1.salary=200000;
    	  
    	  
    	  
    	  
	}

}
