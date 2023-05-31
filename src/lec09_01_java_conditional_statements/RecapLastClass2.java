package lec09_01_java_conditional_statements;

import java.util.Scanner;

public class RecapLastClass2 {

	public static void main(String[] args) {
		System.out.println("----- Put your number below -----");
		Scanner scanner = new Scanner(System.in);
		
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1%2==0 && val1 > val2 && val2%2==1) { // we can use more than 2 condition also, but not in the syntax of line 15
			System.out.println(val1 + " is an even number and " + val1 + " is greater than " + val2);
		} else if (val1%2==0 && val1 < val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is less than " + val2);
		} else if (val1%2==0 && val1 == val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is equal to " + val2);
		} else if (val1%2==0 && val1 != val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is not equal to " + val2);
		} else if (val1%2==1 && val1 > val2 && val2%2==1) { 
			System.out.println(val1 + " is an odd number and " + val1 + " is greater than " + val2);
		} else if (val1%2==1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is less than " + val2);
		} else if (!(val1%2==1 && val1 == val2)) {
			System.out.println(val1 + " is not an odd number and " + val1 + " is not equal to " + val2);
		} else if (val1%2==1 && val1 != val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is not equal to " + val2);
		} else {
			System.out.println("Please put a valid number");
		}
		
		scanner.close();
		
	}

}
