package OOPSPractice;

public class SubClass extends SuperClass {
	
	protected void display(int i)
	{
		System.out.println("Value of integer in sub class is : " + i);
	}
	
	protected void display(String i)
	{
		System.out.println("Value of integer in sub class is : " + i);
		super.display("Calling parent class function");
	}

}
