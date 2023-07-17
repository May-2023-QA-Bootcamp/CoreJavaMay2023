package lec18_03_java_control_statements;

/*
Control statements allows to control the number of times a statement should get executed.

while loop:
all the loop contain: initialization block, conditional block and incremental or decremental block
common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead, 
forgot to put ; after the incremental or decremental block (i++) --- this is for while loop
 
*/

public class B_use_of_java_while_loop {

	public static void main(String[] args) {
		
		System.out.println("\n-------------- for loop 01 --------------\n");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}	
		System.out.println("\n---------- while loop 01  ----------\n");
		int i = 0;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- while loop 02 ----------\n");
		int j = 5;
		while (j<=10) {
			System.out.println(j);
			j += 2; // only change here
		}
		
		// decremental block is used
		System.out.println("\n---------- while loop 03 ----------\n");
		int k = 10;
		while (k >= 5) {
			System.out.println("The value is: " + k);
			k--;
		}
		
		System.out.println("\n---------- while loop 04, condition false, nothing will print as outcome ----------\n");
		// as condition is false, nothing will execute
		int l = 20;
		while (l <= 5) {
			System.out.println("The value is: " + l);
			l -= 2;
		}
		
		System.out.println("\n---------- while loop 05 ----------\n");
		int n = 3;
		int m = 16;
		while (m>5) {
			System.out.print(m*n + ", ");
			m -=3;
		}
		
		// 16, 13, 10, 7
		// 48, 39, 30, 21,
		
		// Always avoid Infinite loop	
	
		
	}

}
