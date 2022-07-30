package Assign;

public class trycatch {
	 public static void main(String[] args) {  
         
         try{    
              int a[]=new int[4];    
              a[1]=30/2; 
              a[6]=9;                                                        
             }    
            catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }  
         
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
         
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }     
         finally{
      	   System.out.println("rest of the code");
         }
         
                 
  }  
}  


