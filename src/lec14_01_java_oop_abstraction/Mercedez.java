package lec14_01_java_oop_abstraction;

// implements keyword can be used alone, without extends keyword
public class Mercedez implements CableCar {
	public void mercedezInfo() {
		System.out.println("Invented in Germany");
	}
	
	@Override
	public void cheap() {
		System.out.println("cheap method is from CableCar Interface");
		
	}

}
