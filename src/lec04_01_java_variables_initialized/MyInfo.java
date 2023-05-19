package lec04_01_java_variables_initialized;

public class MyInfo {
	// variable initialized
	public String name = "Mohammad Tofael Kabir Sharkar"; // not a pure primitive data type
	// primitive data type - 8 type
	public byte age = 100;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 472635467;
	public long myBankBalance = 547623654725347263l; // we must have to use lower case L (l), at the end of long value
	public float myHeight = 1.7343f; // we must have to use lower case f, at the end of float value
	public double myGrade = 3.687686876876;
	public char sex = 'M';
	public boolean usCitizen = false;
		
	// This is a Constructor, a special type of method
	// How to write: first access modifier, then same name as ClassName, finally () 
	public MyInfo () { // Here Constructor is declared 18-21
		// Constructor Body
		System.out.println("This is a Constructor");
	}
	
	// This is a method
	// How to write: first access modifier, then  type of method (here void), Then name start with lower case, finally () 
	// method name follows camel case or snake case feature
	// method name can be same as class name but in lower case, but this is not mandatory
	public void info () { // Here method is implemented
		System.out.println("I am a method");
	}
	
	public void saimoon () {
		System.out.println("I am a student");
	}
	
	public void shabnin () {
		System.out.println("I am a Shabnin from May batch");
	}
	
	

}
