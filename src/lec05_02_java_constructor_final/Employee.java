package lec05_02_java_constructor_final;

public class Employee {
	public String empName;
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;
	
	// default Constructor declared
	public Employee () {
		System.out.println("This Constructor is from Employee class");
	}

	// Parameterized Constructor declared
	public Employee(String empName, int empId, char empSex, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " + fullTimeEmployee); 
	}
	
	
	
	
}
