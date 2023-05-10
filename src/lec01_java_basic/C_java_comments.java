package lec01_java_basic;

/*
 slash + shift 8 (*) + Enter ---- Thats how you can create multiple line comments
 Multiple line comments can contain a single line too
  */

/*
 Java Comments:
- The Java comments are the statements that are not executed by the compiler and interpreter. 
- The comments can be used to provide information or explanation about the variable, method, 
class or any statement.
- It can also be used to hide program code.
- 2 types --> multiple line comments and single line comment
- This is an example of multiple line comments
 */

/*
 * Multiple line comments can't be used at the end of the code [example: line 31]
 * Single line comment can be used at the end of the code [example: line 31] * 
 */

// This is a single line comment
// Single line comment is mostly used in coding
// Used mostly in the beginning as a separate line or at the end of any line of code
// How to create single line comment: for Windows user: we use ctrl + / 
// for Mac user: we use command + / 

public class C_java_comments { // This is a class
	// main method: The entry point of Java
	public static void main(String[] args) { // Main method: Entry point of Java
		System.out.println("This is all about Java Comment"); // we are executing this line
		// You can write comment separately like this
		// control/command slash is the shortcut to write single line comment, 
		// and to re-do, control/command slash, then you will go back to no single line comment
	}

} 
