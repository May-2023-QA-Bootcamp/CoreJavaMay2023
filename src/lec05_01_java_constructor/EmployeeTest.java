package lec05_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// default Constructor Initialized
		Employee emp01 = new Employee();
		// parameterized Constructor 01 initialized
		// Here "Mohammad Sharkar" is called argument
		Employee emp02 = new Employee("Mohammad Sharkar");
		// parameterized Constructor 02 initialized
		Employee emp03 = new Employee("Johirul Islam", 2188657);
		// parameterized Constructor 03 initialized
		Employee emp04 = new Employee(2188657, "Tofael");
		Employee saimoon = new Employee(2188343, "Tanvir Saimoon");
		
		Employee roksana = new Employee(562523, 'F');
		// parameterized Constructor 04 is initialized
		Employee emp05 = new Employee("Tanvir Saimoon", 562354, 'M');
		// parameterized Constructor 05 is initialized
		Employee emp06 = new Employee("Shahab Uddin", 636723, 'M', true);	
		Employee emp07= new Employee("Mohammad Sharkar", 2188458, 'M', true);
		// parameterized Constructor 06 initialized
		Employee emp8= new Employee("Jenifer A", 5588, false, 'F');
		// We can initialize parameters more than one time by creating different object
		Employee emp9= new Employee("John J", 53588, true, 'M');
		Employee emp10 = new Employee("Joe Biden", 55580, false, 'M');
		Employee emp11 = new Employee("Hillary Clinton", 75512, true, 'F');

	}

}
