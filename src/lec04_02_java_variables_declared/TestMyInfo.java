package lec04_02_java_variables_declared;

public class TestMyInfo {

	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); // Constructor in initialized
		tofael.name = "Tofael Kabir"; // variable initialized
		tofael.age = 120;
		tofael.myApartmentRent = 20000;
		tofael.myYearlySalary = 642384624;
		tofael.myBankBalance = 6325457263562l;
		tofael.myHeight = 1.703f;
		tofael.myGrade = 3.34283742;
		tofael.sex = 'M';
		tofael.usCitizen = true;
		// method initialized
		tofael.myInfo();

		System.out.println("\n------------------------------------\n");
		MyInfo shabnin = new MyInfo();
		shabnin.name = "Shabnin";
		shabnin.age = 120;
		shabnin.myApartmentRent = 19000;
		shabnin.myYearlySalary = 542384624;
		shabnin.myBankBalance = 7325457263562l;
		shabnin.myHeight = 1.603f;
		shabnin.myGrade = 3.84283742;
		shabnin.sex = 'F';
		shabnin.usCitizen = true;

		shabnin.myInfo();

		System.out.println("\n-----------------------------------------------------------------------\n");

		MyInfo aroah = new MyInfo();
		aroah.name = "Aroah";
		aroah.age = 23;
		aroah.myApartmentRent = 32445;
		aroah.myYearlySalary = 1782364;
		aroah.myBankBalance = 86536472686l;
		aroah.myHeight = 1.679f;
		aroah.myGrade = 3.488346;
		aroah.sex = 'F';
		aroah.usCitizen = false;
		
		aroah.myInfo();

	}
}
