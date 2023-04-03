package first_class;
class Test{
	public Test() {
		System.out.println("Hi from constructor");
	}
	public Test(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
}
public class Testcons{
	public static void main(String[] args) {
		new Test(123,12);
	}
}
