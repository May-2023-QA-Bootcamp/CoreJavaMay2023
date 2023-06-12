package lec14_01_java_oop_abstraction;

import java.util.HashSet;
import java.util.Set;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota(); // here Constructor is Initialized
		// Below methods are initialized
		toyota.toyotaInfo();
		toyota.toyotaPrice();
		// if a method is static, no help needed from object, the class or Interface can directly call it.
		Toyota.countryOfOrigin();
		toyota.rent();
		toyota.carryingPassenger();
		toyota.carryingGoods();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.lightWeight();
		toyota.expensive();
		toyota.canFloat();
		toyota.price();
		toyota.carName();
		toyota.autopilot();
		toyota.battery();
		ElectricCar.yearOfEstablishment(); // this static method is from Electric Car
		// toyota.yearOfEstablishment(); // it is giving us warning, because static method of Abstract class "Electric Car"
		// yearOfEstablishment() is a static method in Abstract class. Toyota class, (not object) can extends that Abstract class, 
		// so, Toyota itself can initialize that method, but in terms of Interface, it (here gear method) is not allowed for Toyota
		Toyota.yearOfEstablishment();
		toyota.flyingFeature();
		toyota.honk();
		toyota.honk1();
		// toyota.gear();
		// Toyota.gear(); // see line 30
		// gear () is a static method of an Interface, static method of an Interface can't be call by object of a regular class
		System.out.println("Toyota manufactured in: " + toyota.yearOfManufacture);
		System.out.println("Variable from Abstract Class: " + toyota.nameOfElectricCar);
		System.out.println(toyota.INVENTED); // This got warning
		System.out.println(Toyota.INVENTED); // as INVENTED variable is static and Toyota implements Car, that's why no error

		System.out.println("\n--------------------- Interface Car ------------------------\n");
		// Cannot instantiate the type Car which is an Interface. Why?
		// Interview question: why Interface can't be instantiated? because implementation is not complete [as abstract methods present in Interface]
		// an Interface can't be instantiated, it needs the help of a concrete class, Why Toyota is a concrete class here, 
		// Because Toyota helps to implement the Car Interface by "Toyota implements Car"
		Car car = new Toyota();
		// CableCar cc = new Toyota(); // because Toyota never implements the Interface Cable Car
		car.start();
		car.stop();
		car.brake();
		car.honk();
		car.honk1();
		// car.gear(); // because static method
		Car.gear();
		// no need of object, Interface/class can directly call static methods, 
		// but static method in abstract class can be called by Regular class Toyota object (but got warning), Regular class can call directly
		car.rent();
		car.carryingPassenger();
		car.carryingGoods();
		System.out.println("The Car invented in: " + Car.INVENTED );
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		// Cannot instantiate the type ElectricCar which is an Abstract Class. Why?
		// Interview question: why Abstract Class can't be instantiated? because implementation is not complete [as abstract methods present in Abstract Class]
		// an Abstract Class can't be instantiated, it needs the help of a concrete class, Why Toyota is a concrete class here, 
		// Because Toyota helps to extends ElectricCar the Abstract Class by "Toyota extends ElectricCar"
		ElectricCar electricCar = new Toyota();
		electricCar.battery();
		electricCar.price();
		electricCar.carName();
		electricCar.yearOfEstablishment(); // it get's warning because better to call by Class or Interface 
		ElectricCar.yearOfEstablishment();
		electricCar.flyingFeature();
		electricCar.autopilot();
		electricCar.expensive();
		electricCar.canFloat();
		electricCar.costOfTesla = 65000;
		System.out.println("Electric Car name: " + electricCar.nameOfElectricCar + ", and price: " + electricCar.costOfTesla);
		
		System.out.println("\n--------------------- Not Instantiating here: Drone, FlyingCar, Ferrari, HoverCar, Mercedes, Rocket, Taxi, Truck. But possible ------------------------\n");
		
		
		
	}

}
