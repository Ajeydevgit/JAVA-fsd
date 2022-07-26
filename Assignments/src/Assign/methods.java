package Assign;


public class methods {
	public void calculate(int a,int b)
	{
		 System.out.println("Area of the Rectangle is "+ a*b);
	}
	public void calculate(float f)
	{
		 System.out.println("Area of the is Circle is"+(314*f*f));
	}
	public void calculate(int r,float g )
	{
		 System.out.println("Addition is" +(r+g));
	}
	public void calculate(float s,int t )
	{
		 System.out.println("Area of the Traiangle is " + (0.5*s*t));
	}
	public static void main(String[] args)
	{
		methods ob=new methods();
		ob.calculate(2,3);
		ob.calculate(2.90f);
		ob.calculate(3,6.7f);
		ob.calculate(3.14f,4);
	}
		
}
		 
	
	


