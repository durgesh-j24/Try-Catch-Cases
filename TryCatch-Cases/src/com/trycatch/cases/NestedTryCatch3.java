package com.trycatch.cases;

public class NestedTryCatch3 {
	
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
		    //run this finally 
		    finally { 
		    	System.out.println("rest of the code...");  
			}
		    
		  }
		  catch(Exception e)
		  {
			  System.out.println("handeled");
			  
		  }  
		  //run this outer finally also
		  finally {
		    	System.out.println("rest of the code...");  
			}
		  System.out.println("normal flow..");  
		  
		 }  

}
