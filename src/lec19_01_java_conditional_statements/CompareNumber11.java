package lec19_01_java_conditional_statements;

public class CompareNumber11 {
	// Why static? Non static method or variable can't be called inside main method
	static int val1 = 87;
	static int val2 = 87;
	
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
		solution();
		// CompareNumber05 cb = new CompareNumber05();
		
		
	}
}
