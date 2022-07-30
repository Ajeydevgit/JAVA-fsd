package Assign;


	interface  scale1
	{
	    default void show() 
	    { 
	        System.out.println("First"); 
	    } 
	} 
	interface scale2 
	{  
	    default void show() 
	    { 
	        System.out.println("Second"); 
	    } 
	}  
	public class diamond implements scale1,scale2
	{  
	    public void show() 
	    {  
	        scale1.super.show(); 
	        scale2.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        diamond ob = new diamond(); 
	        ob.show(); 
	    } 
	

}
