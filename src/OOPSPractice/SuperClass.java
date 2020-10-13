package OOPSPractice;

public class SuperClass {
	
	/*
	 ****** Method Overloading *********
	 *Methods should have same name but different type/number of arguments
	 *
	 *Changing access modifiers or return type is not applicable for method overloading
	 */

	
	void display(int i)
	{
		System.out.println("Value of integer in super class is : " + i);
	}
	
	void display(String s)
	{
		System.out.println("Value of string in super class is : " + s);
	}


}
