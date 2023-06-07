package lec12_01_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		// we put argument in the parameterized setStName method 
		student.setStName("Alex Butcher");
		student.setStId(2188458);
		student.setStSex('M');
		student.setFullTimeSt(true);
		student.setStGrade(3.667f);
		
		System.out.println("Student Name: " + student.getStName() + ", \nID: " + student.getStId() + ", \nSex: "
				+ student.getStSex() + ", \nFull Time student? : " + student.isFullTimeSt() + " \nGrade: " + student.getStGrade());

	}

}
