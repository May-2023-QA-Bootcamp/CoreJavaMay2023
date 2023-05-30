package lec08_01_java_conditional_statements;

import java.util.Random;

public class CompareNumber05 {
	public static void main(String[] args) {
		System.out.println("---: Please put your numbers below :---");
		Random random = new Random();
		
		int val1 = random.nextInt(100);
		int val2 = random.nextInt(100);
		
		if (val1 == val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else if (val1 != val2){ // Not equal to
			System.out.println(val1 + " is either greater than or leass than " + val2);
		} else if (!(val1 == val2)) { // This is same as line 15, represent logical not operator
			System.out.println(val1 + " is not equal to " + val2);
		} else {
			System.out.println("The system failed to figure it out");
		}
	}

}
