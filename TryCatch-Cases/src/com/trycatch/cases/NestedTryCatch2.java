package com.trycatch.cases;

public class NestedTryCatch2 {
	
	public static void main(String args[]){  
		
		  try{ 
			  
		    try{ 
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }
		    finally {
		    	System.out.println("rest of the code...");  
			}
		    
		  }
		  // Handle by this catch block
		  catch(Exception e)
		  {
			  System.out.println("handeled");
		  }  
		  
		  System.out.println("normal flow..");  
		  
		 }  

}
