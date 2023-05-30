package lec08_01_java_conditional_statements;

import java.util.Scanner;

// We will solve this issue in the next class
public class CompareNumber12 {
	// Why static? Non static method or variable can't be called inside main method
	static Scanner scanner = new Scanner(System.in);
	static int val1 = scanner.nextInt();
	static int val2 = scanner.nextInt();
		
	// If val1 < val2, multiply val1 with val2
	public static void multiplication () { 
		int mult = val1*val2;
		System.out.println("Multiplication is: " + mult);
	}
	
	// If val1>val2, divide val1 by val2
	public static void division () {
		int div = val1/val2;
		System.out.println("Division is: " + div);
	}
	
	// If val1 == val2, do an addition of val1 and val2
	public static void addition () {
		int add = val1 + val2;
		System.out.println("Addition is: " + add);
	}
	
	public static void solution() {
		if (val1 < val2) {
			multiplication();
		} else if (val1 > val2) {
			division();
		} else if (val1 == val2) {
			addition();
		}
	}
	
	// if condition should be inside method, it can' be free, like you can not write condition in line 62

	public static void main(String[] args) {
		System.out.println("---: After putting the numbers above :---");
		solution();		
		scanner.close();
	}
}
