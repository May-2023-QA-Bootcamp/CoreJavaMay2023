package lec19_01_java_conditional_statements;

public class S01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'L';
		
		switch (size) {
		
		case 'S':
			System.out.println("Yes, we have small size shirt");
			break;
			
		case 'M':
			System.out.println("Yes, we have medium size shirt");
			break;
			
		case 'L':
			System.out.println("Yes, we have large size shirt");
			break;
			
		case 'X':
			System.out.println("Yes, we have extra large size shirt");
			break;
			
		default:
			System.out.println("Sorry! we don't have your size");
			break;
			
		}
		
		
		
		
		
		
		
		

	}

}
