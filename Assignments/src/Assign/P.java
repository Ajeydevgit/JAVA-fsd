package Assign;

public class P {
	public static void main(String[] args) {
		 M obj1 = new  M();
		 N obj2 = new  N();
		obj1.methodofpublicM();
		obj2.methodofpublicN();
		
	}


	public void methodofpublicP()
	{
		System.out.println("Class P: public method");
	}
	protected void methodofprotectedP()
	{
		System.out.println("Class P: Protected method");
	}
	void methodofdefaultP()
	{
		System.out.println("Class P: Default method");
	}
	private void methodofprivateP()
	{
		System.out.println("Class P: Private method");
	}
}
