package HomeWorks4;

public class BoxTest {
	public static void main(String[] args) {
		Box<String> strBox = new Box<String>();
		strBox.add(new String("Test"));
		String someStr = strBox.get();
		System.out.println(someStr);
	}
}