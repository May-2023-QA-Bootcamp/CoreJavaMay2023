package lec18_01_Java_Nested_Class;

// Outer Class
public class JFK02 { // Opening of the outer Class Body
	
	// To get access of the inner class properties, Inner class must be Instantiated inside outer Class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
	
	// Here is the change
	// method from the Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
		
		// the inner class object can call their properties (methods) inside the outer class method body
		t1.destination();
		t2.usAirlines();
		t4.arabianFlights();
	}
	
	// First Inner Class
	public class TerminalOne { // Opening of the inner Class Body
		
		// method from the Inner class
		public void destination() {
			System.out.println("Terminal One is for Saudi Arabia");
		}
		
	} // Closing of the inner Class Body
	
	// Second inner class
	public class TerminalTwo {
		
		public void usAirlines() {
			System.out.println("Terminal two is for Delta International");
		}
		
	}
	
	// Here is a little change
	// Static inner class
	public static class TerminalFour { 
		
		public void arabianFlights () {
			System.out.println("Terminal four is for Emirates International");
		}
	} 

} // Closing of the outer Class Body
