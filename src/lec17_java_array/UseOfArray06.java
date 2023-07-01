package lec17_java_array;

import java.util.Arrays;

public class UseOfArray06 {
	public static void main(String[] args) {
		String[] ax = new String[] { "First", "Second", "Third", "Fourth", "Fifth" };
		// Literal representation of an String type Array, line 11 is the best representation of an Array

		String[] ay = new String[] { "First", "Second", "Third", "Fourth", "Fifth" };
		// Print the array using default toString method - Do not Use it
		// System.out.println(ay.toString());

		// Print the array using Arrays.toString() - "RECOMMENDED for simple arrays"
		System.out.println("The list of the array's [ax] elements: "+Arrays.toString(ax));
		System.out.println("The list of the array's [ay] elements: "+Arrays.toString(ay));
		
		// until line 16 is fine
		
		// New 22-29, how to write a multidimensional Array
		// Need to know about Multi Dimensional Array
		String[] arr1 = new String[] { "hundred", "hundred One" };
		String[] arr2 = new String[] { "two hundred", "thirty four" };
		// common name:  multi dimensional array [hard topic in framework, will repeated by Shohag and Nasir]
		// An array of array containing String objects //double dimension or two dimensional or multi dimensional -- important
		// Also interview Question
		
		// Line 26 is the take out from this page
		String [][] multiDimensionalArray = new String[][] { arr1, arr2 }; // This array is containing 2 other Array
		// Compare the different outputs
		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(multiDimensionalArray)); // providing Array ID, so not giving value

		// method is Not important
		// Print the array using Arrays.deepToString() - "RECOMMENDED for multi-dimensional array"
		System.out.println(Arrays.deepToString(multiDimensionalArray));
		
		
		
		
		
		
		
		
		
		

	}

}
