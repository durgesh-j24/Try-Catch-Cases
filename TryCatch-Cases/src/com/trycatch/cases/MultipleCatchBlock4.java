package com.trycatch.cases;

public class MultipleCatchBlock4 {
	
	public static void main(String[] args) {  
        
        try{    
             String s=null;  // null value assign
             System.out.println(s.length());  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  //Execute this catch because of NullPointerException
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
 }  

}
