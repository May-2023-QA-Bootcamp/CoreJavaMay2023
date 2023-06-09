package lec13_03_java_basic_interview_question;

// Can you call a non-static (global) variable or method inside the main method (without creating object)?
// Ans: No, a non static variable or method can't be called inside static method
// FYI: main method is static in nature
// How you can resolve that issue?
// By making the variable static

public class Employee2 {
	public static String empName = "Mohammad Sharkar";
	public static int empId = 2188458;
	public static char sex = 'M';
	public static boolean fullTimeEmployee = true;

	public static void main(String[] args) {
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Sex: " + sex
				+ " and Full time Employee? Ans: " + fullTimeEmployee);

	}

}
