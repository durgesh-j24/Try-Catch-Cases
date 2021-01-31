package com.trycatch.cases;

public class NestedTryCatch1 {
	
	public static void main(String args[]){  
		
		  try{ 
			  
		    try{ 
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }
		    catch(ArithmeticException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println("other statement");  
		  }
		  catch(Exception e)
		  {
			  System.out.println("handeled");
		  }  
		  
		  System.out.println("normal flow..");  
		  
		 }  

}
