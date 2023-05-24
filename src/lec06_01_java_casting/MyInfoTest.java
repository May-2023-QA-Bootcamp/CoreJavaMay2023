package lec06_01_java_casting;

public class MyInfoTest {

	public static void main(String[] args) {
		MyInfo myInfo1 = new MyInfo();
		// parameterized Constructor Initialized
		// you will not use it for coding, just extra information
		// In Constructor, the system can't recognize byte and short type, so we need to do casting for that
		MyInfo myInfo2 = new MyInfo("Alex F", (byte) 28, (short) 32000, 67327642, 263543462864l, 1.534f, 3.56374, 'M', true);
	}

}
