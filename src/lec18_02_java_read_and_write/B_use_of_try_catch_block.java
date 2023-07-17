package lec18_02_java_read_and_write;

public class B_use_of_try_catch_block {

	public static void main(String[] args) {
		int a = 13;
		int b = 0;
		try {
			int division = a/b;
			System.out.println(division);
		} catch (ArithmeticException e) {
			System.out.println("The Exception occured here is >>>>>> " + e);
		}
		// if the below line printed, the flow of the program is not interrupted, otherwise opposite
		System.out.println("May 2023 Batch");
		
	}

}
