package lec04_01_java_variables_initialized;

public class TestMyInfo {

	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo(); // Constructor in initialized
		myInfo.info(); // method is initialized here
		System.out.println("My Name: " + myInfo.name + "\nMy Age: " + myInfo.age + "\nMy Apartment Rent: "
				+ myInfo.myApartmentRent + "\nYearly Salary: " + myInfo.myYearlySalary + "\nMy Bank Balance: "
				+ myInfo.myBankBalance + "\nMy Sex: " + myInfo.sex + "\nMy Height: " + myInfo.myHeight + "\nMy Grade: "
				+ myInfo.myGrade + "\nAm I US Citizen? Ans: " + myInfo.usCitizen);

		myInfo.saimoon();
		myInfo.shabnin();
	
	
	
	
	}
	
	
	
	

}
