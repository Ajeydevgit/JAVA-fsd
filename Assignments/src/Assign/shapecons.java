package Assign;


public class shapecons {
	double  radius;
	double length;
	double breadth;
    double rho;
	double tro;
	public shapecons(){
		System.out.println("Default Constructor");
	}
    shapecons(int c){
		  radius=c;
		  System.out.println(radius);
	}
    shapecons(int l,float b){
		  length=l;
		  breadth= b;
	}
    shapecons(int l,int b){
    	  length=l;
    	  breadth=b;
    }
    void displaycircle(){
    	 System.out.println(radius);
    	 System.out.println("Area of the Circle is " + (3.14*radius*radius));
    }
    void displaysquare(){
    	System.out.println(length+ " "+ breadth);
   	 System.out.println("Area of the Square is " + (length*breadth));
   }
    void displayrectangle(){
   	 System.out.println("Area of the Rectangle is " + (length*breadth));
   }
    public void Area(int p,int q)
	{
		rho=(p*q)/2;
		System.out.println("Area of rhombus is: "+rho);
	}
	public void Area(long h,float b)
	{
		tro=(int) ((h*b)/2);
		System.out.println("Area of triangle is: "+tro);
	}
	public static void main(String[] args){
		 shapecons s =new shapecons();
		 shapecons s1=new shapecons(3,3.3f);
		 shapecons s2=new shapecons(2);
		 shapecons s3=new shapecons(7,8);
		 s1.displaysquare();
		 s2.displaycircle();
		 s3.displayrectangle();
		 s.Area(4,5);
		 s.Area(12l,23.1f);
	}
    
	

}
