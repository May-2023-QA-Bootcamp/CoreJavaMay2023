package lec18_02_java_read_and_write;

public class A_why_to_use_try_catch_block {

	public static void main(String[] args) {
		int a = 13;
		int b = 0;
		int division = a/b;
		System.out.println(division);
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("May 2023 Batch"); // this line will not be executed
	}

}
