package lec17_java_array;

import java.util.Arrays;

public class UseOfArray01 {
	public static void main(String[] args) {
		System.out.println("\n------------------------------------------------------------------------");
		// same data type or a cluster of data present
		// How to write an Array: first data type, then [], it is called container, the student (OBJECT) is the name of Array, [4] represent total 4 data is present
		// Array is static [fixed]
		String [] student = new String [4]; 
		student [0] = "Jahanara";
		student [1] = "Mamun";
		student [2] = "Mehdi";
		student [3] = "Raihan";
		// student [4] = "Rashed";
		
		System.out.println(student[0]);
		System.out.println(student[3]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		System.out.println(student.length);
		// important interview question: length () vs length
		
		System.out.println("\n------------------------------------------------------------------------");
		// or
		// below is the alternate way to write Array, called literal representation of the Array, you will hear this words in the industry
		String [] studentMay = new String [] {"Rashed", "Riyadth", "Saif", "Sharaj", "Shabnin", "Shahab", "Shaila", "Tanvir"}; 
		System.out.println(studentMay[0]);
		System.out.println(studentMay[5]);
		System.out.println(studentMay.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// or	without  new String [] 
		
		String [] mayStudent = {"Jahanara", "Mamun", "Mehdi", "Raihan", "Rashed", "Riyadth", "Saif", "Sharaj", "Shabnin", "Shahab", "Shaila", "Tanvir"};
		System.out.println(mayStudent[0]);
		System.out.println(mayStudent[5]);
		System.out.println(mayStudent.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// or	without new int [] 
		int [] age = {25, 30, 35, 47, 45, 23, 100, 44, 62};
		System.out.println(age[0]);
		System.out.println(age.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// char type
		char [] sex = {'M', 'M', 'M', 'F', 'M'};
		System.out.println(sex[3]);
		System.out.println(sex.length);
		
		// How to write an Array: first data type, then []  container, then array name = data inside curly braces, ended up with semicolon
		
		// New 
		int [] a = new int [5]; // declaring the size of the array, here it is 5
		// Array is fixed size (Array is static)
		// a is the name of the array
		// [] called container
		// Mixed data type can't be used, example: int and String can't mixed inside one Array
		
		a[0] = 5;
		a[1] = 15;
		a[2] = 'C'; // just know of ASCII table, explained at the end, no need to memorize
		
		a[4] = 3;
		
		System.out.println("\n------------- Printing single index value ------------\n");
		System.out.println("Printing single index value: " + a[0]); // output: ?
		System.out.println("Printing single index value: " + a[3]);// output: ?
		// when no value is assigned to an index, it shows the default value of the data type
		System.out.println("Printing single index value: " + a[4]);// output: ?
		System.out.println("Printing single index value: " + a[1]);// output: ?
		System.out.println("Printing single index value: " + a[2]);// output: ?
		// System.out.println("Printing single index value: " + a[5]);// output: ?
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		// out of bounds for length 5
		// interview question: What is the exception you got if Array called is out of range?
		// Ans: ArrayIndexOutOfBoundsException 
		
		System.out.println("\nThe length of the array is: " + a.length); // important interview question
		// length preserve the size of an array, length is not a method or field or variable,
		// rather a parameter/properties
		
		// int [] a = {5, 15, 50, 0, 56}
		// a.length = 5
		// a [0] = 5, a [1] = 15, a [2] = 50, a [3] = 0, a [4] = 56
		// a[4] = a [5-1] = a[a.length - 1]
		// important interview question: How to find (what is the formula) the value for last index from an Array?
		System.out.println("\nPrinting the last number of the Array: " + a[a.length - 1]); 
		
		// Que: how can you find the second last index from an array?
		// Ans: a[a.length - 2])
		
		System.out.println("\n------------------------------------------------------------------------");
		// very very important -->  toString(a) method
		//	Returns a string representation of the contents of the specified array. The string representation consists 
		// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
		// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 
		
		// Array vs Arrays, Arrays is a class which is used to manipulate the Array
		// What will happen if you directly print by Array name or object? Ans: you will get the Array ID
		System.out.println(a); // get something else to check, if it is run --> Array ID
		System.out.println("To find the list of an Array: " + Arrays.toString(a));
		
		// Returns "null" if b is null.
		int [] b = new int [0]; // 0 elements, no elements there, also called null
		System.out.println("To find an Array when size is Null: " + Arrays.toString(b)); // You will find Empty Array
		System.out.println(b.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// NOT IMPORTANT
		System.out.println("\nPrinting Array ID: " + a); // Array ID
		// NOT IMPORTANT
		System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(a));
		// hashCode of the Array used for representation of array by data	
		// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
		// NOT IMPORTANT
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 15)); // which index is 15?
		// here a is the name of the array, 15 is the value checking the index number
		// binary search to get the index position of the value from the ref
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 5));
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 67));
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 0)); //TODO WHY -1?
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 3)); //TODO WHY -1?
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
