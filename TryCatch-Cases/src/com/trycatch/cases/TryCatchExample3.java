package com.trycatch.cases;

public class TryCatchExample3 {
	
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
              
        catch(Exception e)  
        {  
                  // displaying the custom message  
            System.out.println("Can't divided by zero");  
        }  
    }  

}
