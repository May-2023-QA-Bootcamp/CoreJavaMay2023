package lec06_02_java_methods;

public class Calculator03 {
	int a = 39;
	int b = 21;
	
	String fName = "Mohammad";
	String lName = "Sharkar";
	
	public Calculator03 () {
		multiplication();
		subtraction();
		// Constructor can call methods too.
		// Why we need to put methods inside constructor?
		// if a class is instantiated, constructor is initialized, so if we put something need us during instantiation, then it helps
	}
	
	// return type method
	public int multiplication () {
		int total1 = a * b;
		System.out.println("The value is: " + total1);
		return total1;
		// here int default value is : 0
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}

}
