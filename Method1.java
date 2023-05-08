
public class Method1 {

	public static void main(String[] args) {

		Method1 s = new Method1();// Object creation.
		s.m();// Calling
	}

	public void m() // m method name
	{
		System.out.println("Never give up");
	}

	public void add() {
		int a = 10;
		int b = 30;
		int c = a + b;
		System.out.println(c);

	}
	public void sub() {
		int a = 40;
		int b = 30;
		int c = a - b;
		System.out.println(c);
	}

}
