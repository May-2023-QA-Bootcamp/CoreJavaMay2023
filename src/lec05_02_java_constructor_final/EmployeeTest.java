package lec05_02_java_constructor_final;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee emp1 = new Employee("Mohammad Sharkar", 2188458, 'M', true);
		Employee emp2 = new Employee("Roksana", 3451658, 'F', false);
		Employee emp3 = new Employee("Rashed", 6651658, 'M', false);

	}

}
