package lec10_01_java_control_statements;

/*

 What do the control statements do? 
-- control statements allow you to control how many (the number of) times a statement should get executed. For example: for loop, while loop etc.

What is a loop? What is the use of a loop? Write all different kinds of loops. *****
-- Loop is a programming structure that repeats a sequence of instructions until a specific condition is met.

The different kinds of loops are: for loop, while loop, do while loop, for each loop*, iterator** etc. 
* ‘for each loop’, mostly used in Array (we will learn when we study Array).
** ‘iterator’ -- we will also learn later. This is the first loop used in java.

What is the difference between "while" loop and "do...while" loop? ******
-- In the while loop, the condition is tested at the beginning of the loop and if the condition is True, then the statements in that loop will be executed. If the condition is false, statements inside that loop will not be executed.
In the do while loop, the condition is tested at the end of the loop. Even if the condition is false, then the statements inside that loop will be executed, at least once.

Why do Programmers usually use loops? ****
-- Programmers usually use loops to execute a set of statements. 
-- The difference between for loop and while loop is that in for loop the number of iterations to be done is already known and is used to obtain a certain result whereas in while loop the command runs until a certain condition is reached and the statement is proved to be false. (Need to ask Nasir for more clarification)
-- do while loop is similar to while loop, but it possesses one dissimilarity: In while loop, the condition is evaluated before the execution of loop’s body but in do while loop condition is evaluated after the execution of loop’s body.

Which loop is most commonly used?
-- for loop

What are the components of a loop? ****
-- all the loops contain 3 parts. 
i) initialization block (int i=0), 
ii) conditional block (i<=10) and 
iii) incremental (i++) or decremental (i--) block
 
What are the common mistakes of loop?
-- in for loop: we forgot type of variable (like: int), put comma instead of semicolon (;)
-- in while loop and do while loop: we forgot type of variable (like: int), put comma instead of semicolon (;), forgot semicolon(;) after incremental (i++) or decremental (i--) block

If you wanna increment by 1, what would you type? ***
-- here: i++, i=i+1, i +=1

If you wanna increment by 2, what would you type?
-- here: i=i+2, i +=2

If you wanna increment by 3, what would you type?
-- here: i=i+3, i +=3

If you wanna decrement by 1, what would you type? ***
-- here: i--, i=i-1, i -=1

If you wanna decrement by 2, what would you type?
-- here: i=i-2, i -=2

If you wanna decrement by 3, what would you type?
-- here: i=i-3, i -=3

Source: https://www.javatpoint.com/java-for-loop
 
 What is a nested loop?***
-- A nested loop is a loop that appears in the loop body of another (outer) loop. The inner or outer loop can be any type: while, do while, or for loop. For example- the inner loop can be a while loop while an outer loop can be a for loop. Of course, they can be the same kind of loops too.

What is Java Break Statement? ****
-- When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop. It is used to break a loop or switch statement. It breaks the current flow of the program at specified conditions. In the case of an inner loop, it breaks only the inner loop. We can use Java break statements in all types of loops such as for loop, while loop and do-while loop.


What is Java Continue Statement?
-- The Java continue statement is used to continue the loop. It continues the current flow of the program and skips the remaining code at the specified condition (jump to the next iteration of the loop immediately). In the case of an inner loop, it continues the inner loop only. We can use Java continue statements in all types of loops such as for loop, while loop and do-while loop.

 */

public class Info_java_control_statement {

}
