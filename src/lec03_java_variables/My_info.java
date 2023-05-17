package lec03_java_variables;

public class My_info {
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

	public static void main(String[] args) {
		// My_info (blue color) is a class, myInfo (yellow color) is an object, also called reference type variable
		// object name always start with lower case, follow camel case or sanke case feature
		// = equal operator, new is a keyword of Java

		// What happened below?
		// an object is created (myInfo) (by you) from MyInfo class (following blueprint) which (object) is
		// new and MyInfo type
		// This action (line 31) --> (when an object is created from a class) is called instantiation, (vvImp info)
		// Then we say the class (My_info) is instantiated
		// Class Instantiated
		My_info myInfo = new My_info();
		System.out.println(myInfo.name); // Object can call the variables, call means object can use those variables
		System.out.println(myInfo.age);
		System.out.println(myInfo.myApartmentRent);
		System.out.println(myInfo.myYearlySalary);
		System.out.println(myInfo.myBankBalance);
		System.out.println(myInfo.myHeight);
		System.out.println(myInfo.myGrade);
		System.out.println(myInfo.sex);
		System.out.println(myInfo.usCitizen);
		System.out.println("My Name: " + myInfo.name);
		System.out.println("My Name: " + myInfo.name + ", My Age: " + myInfo.age);
		System.out.println("My Name: " + myInfo.name + "\nAge: " + myInfo.age + "\nSex: " + myInfo.sex);
		// in line 39, we could call all the variables here, but I didn't do it here, It is possible to call all of them
		// will do in the next class
		
	}

}
