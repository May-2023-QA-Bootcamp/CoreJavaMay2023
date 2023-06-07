package lec12_02_java_enumeration;

public class Shirt {
	
	// Enum Size type variable is chart
	Size chart;
	
	// we arite default constructor because , this is a norm when we create parameterized constructor
	public Shirt() {

	}
	
	// We need to use this
	public Shirt(Size chart) {
		this.chart = chart;
	}

	public void findMyShirt() {
		
		switch (chart) {

		case XSMALL:
			System.out.println("Extra small size Shirt is selected");
			break;

		case SMALL:
			System.out.println("Small size Shirt is selected");
			break;

		case MEDIUM:
			System.out.println("Medium size Shirt is selected");
			break;

		case LARGE:
			System.out.println("Large size Shirt is selected");
			break;

		case XLARGE:
			System.out.println("Extra Large size Shirt is selected");
			break;

		case XXLARGE:
			System.out.println("Extra Extra Large size Shirt is selected");
			break;

		default:
			System.out.println("Sorry we are out of Stock");
			break;

		}

	}

}
