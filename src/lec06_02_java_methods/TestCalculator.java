package lec06_02_java_methods;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator01 cal01 = new Calculator01();
		cal01.addition();
		cal01.subtraction();
		cal01.multipliaction();
		cal01.division();
		
		System.out.println("\n-----------------------------------------------------\n");
		Calculator02 cal02 = new Calculator02();
		cal02.addition();
		cal02.myName();
		cal02.subtraction();
		cal02.usCitizen();
		
		System.out.println("\n-----------------------------------------------------\n");
		Calculator03 cal03 = new Calculator03();
		
		System.out.println("\n-------------------------- calling subtraction method only -----------------------------\n");
		Calculator04 cal04 = new Calculator04(); // Constructor Initialized
		cal04.subtraction();
		
		System.out.println("\n-----------------------------------------------------\n");
		Calculator05 cal05 = new Calculator05();
		cal05.addition(1.34f, 3.22f);
		cal05.addition(2.34f, 4.22f);
		cal05.division(4.55f, 0.778f);
		cal05.division(6.15f, 4.17f);
		cal05.division(0.999f, 0.234f);
		
		System.out.println("\n------------------------------------------------\n");
		Calculator06 cal06 = new Calculator06();
		cal06.addition(323, 409); // argument
		cal06.addition(123, 9); // argument
		cal06.addition(30, 19); // argument
		cal06.subtraction(3251, 9);
		cal06.subtraction(333, 11);
		cal06.multiplication(22, 4);
		cal06.multiplication(322, 74);
		cal06.division(44, 8);
		cal06.division(764, 238);
		cal06.stName("Chowdhury", "Rashed");
		cal06.stName("Tanzila", "Zafar");
		cal06.stName("Shabnin", "Shahrin");
		cal06.stName("Roksana", "Akter");
		
		System.out.println("\n------------------------ allMethods -----------------------\n");
		cal06.allMethods(4, 2);
		cal06.allMethods(9, 4);
		cal06.allMethods(9213, 4334);
		
		System.out.println("\n------------------------------------------------\n");
		cal06.employee("Tanzila Zafar", 73043, 'M', true);
		cal06.employee("Tanvir Saimoon", 9088458, 'M', true);
		cal06.employee("Shaila Mukta", 1088458, 'F', true);

		System.out.println("\n------------------------------------------------\n");
		Calculator07 cal07 = new Calculator07();
		cal07.addition(56, "20");
		// cal07.addition(34, "Tofael"); // see what kind of error come
		cal07.multiplication(3.65426, "2.73687");
		cal07.addition(32, "66");
		cal07.multiplication(3.65426, "2.73687");
		cal07.subtraction(323, 24.4234);
		cal07.division01(62357, 642.823974f);
		cal07.division02(2357, 42.84f);
		
		System.out.println("\n------------------------------------------------\n");
		Calculator08 cal08 = new Calculator08();
		cal08.division();
		cal08.multiplication();
	
	}

}
