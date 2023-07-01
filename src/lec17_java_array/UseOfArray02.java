package lec17_java_array;

import java.util.Arrays;

public class UseOfArray02 {
	public static void main(String[] args) {
		int [] a = new int [] {15, 34, 59, 5, 28, 12}; 
		// Above is the alternate way to write Array, called literal representation of an Array
		System.out.println("\n------------- Printing single index value -------------\n");
		System.out.println("Printing single index value: " + a[0]); // output: ?
		System.out.println("Printing single index value: " + a[3]); // output: ?
		System.out.println("Printing single index value: " + a[4]); // output: ?
		System.out.println("Printing single index value: " + a[1]); // output: ?
		System.out.println("Printing single index value: " + a[2]); // output: ?
		
		System.out.println("First index value: " + a[0]);
		// Que: how can you find the last number from an array?
		// {15, 34, 59, 5, 28, 12}
		// a[5] = a [6-1] = a[a.length-1]
		System.out.println("Last index value: " + a[a.length - 1]); // important
		System.out.println("Second last index value: " + a[a.length - 2]); // important	
		// How can you print Array
		System.out.println("To find the list of an (or what is inside the array) Array: " + Arrays.toString(a) + "\n");
		
		// New from here, also important
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("Before sort of the Array: " + Arrays.toString(a) + "\n");
		
		Arrays.sort(a);
		// sort() method sorts the specified array of bytes into ascending numerical order.
		System.out.println("After sort of the Array: " + Arrays.toString(a) + "\n");
		
		System.out.println("\n------------------------------------------------------------------------");
		// How to find the smallest and largest number from an Array?
		// Answer: First sort the Array by Arrays.sort(a);, then a[0]=smallest, a[a.length-1]=largest
		// The interviewer don't like this answer
		System.out.println("Smallest value of Array is: " + a[0]);
		System.out.println("Largest value of Array is: " + a[a.length - 1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
