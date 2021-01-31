package com.trycatch.cases;

public class NestedTryCatch4 {
	
	public static void main(String args[]){  
		
		  try{ 
			  
			  int b[]= {1,2,3,5};
			  
		    try{ 
		    	int a[]=new int[5];    
	             a[5]=30/0;    
	              
		    }
		    catch(ArithmeticException e)  
            {  
             System.out.println("Arithmetic Exception occurs");  
            }    
		    catch(ArrayIndexOutOfBoundsException e)  
            {  
             System.out.println("ArrayIndexOutOfBounds Exception occurs");  
            }    
		    		    
		    finally { 
		    	System.out.println("rest of the code...");  
			}
		    
		    System.out.println(b[5]);
		    
		  }
		  catch(Exception e)
		  {
			  System.out.println("handeled");
			  
		  }  
		  
		  finally {
		    	System.out.println("rest of the code...");  
			}
		  System.out.println("normal flow..");  
		  
		 }  
}
