package com.trycatch.cases;

public class TryCatchExample1 {  
	  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code will run");  
    }  
      
}  