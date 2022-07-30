package Assign;


	abstract class Vehicle{
		int speed;
		long distance;
		
		Vehicle()
		{
			System.out.println("In a Vehicle class constructor");
		}
		Vehicle(int s,long d)
		{
			speed=s;
			distance=d;
			System.out.println("Pramatrized constructor ");
		}
		abstract void run();
		abstract void stop();
		
		public void fuel(int a)
		{
			System.out.println(a);
		}
		public void fuel(float f,String s)
		{
			System.out.println(f+" "+s);
		}
		public void fuel(int b,char c)
		{
			System.out.println(b+" "+c);
		}
	}
	class TwoW extends Vehicle{
		int speed=10;
		long distance=250;
		int no_of_tyres=2;
		TwoW()
		{
			super(10,20);
			System.out.println("In a TwoW class constructor");
		}

		@Override
		void run() {
			System.out.println("Run Abstract method is override in TwoW class");
		}

		@Override
		void stop() {
			System.out.println("Stop Abstract method is override in TwoW class");
			
		}
		public void display()
		{
			System.out.println("TwoW class variables");
			System.out.println(speed);
			System.out.println(distance);
			System.out.println(no_of_tyres);
			System.out.println("Vehicle class variables");
			System.out.println(super.speed);
			System.out.println(super.distance);
		}
	}

	public class Alloopsconcepts {

		public static void main(String[] args) {
			Vehicle v=new TwoW();
			v.fuel(10);
			v.fuel(1.5f, "Praveen");
			v.fuel(1, 'd');
			v.run();
			v.stop();
			
			TwoW t=new TwoW();
			t.display();
			

		}

	}



