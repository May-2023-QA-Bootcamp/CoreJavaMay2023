package lec09_02_java_control_statements;

/*
This is a very important topic used almost everywhere, like variables and methods

for loop: most commonly used (No 1) loop
all the loop contain 3 part --
initialization block ----- int i=0;
conditional block ----- i<=10; 
and incremental (i++) or decremental block (i--)
What are the common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead

i++ means increment by 1 (most common style for increment by 1)
i=i+1 means increment by 1
i +=1 means increment by 1

i = i+2 means increment by 2
i += 2 means increment by 2

i = i+3 means increment by 3
i +=3 means increment by 3

i-- means decrement by 1
i = i-1 means decrement by 1
i -= 1 means decrement by 1
i = i-2 means decrement by 2
i -= 2 means decrement by 2
i = i-3 means decrement by 3
i - = 3 means decrement by 3

The name for-loop comes from the word for. For is used as the keyword in many 
programming languages to introduce a for-loop.

*/

public class A_use_of_java_for_loop {
	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	
	
	

}
