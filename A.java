
public class A {
	int a;
	String s;

	A() {// constructor if we add A(int a, int b) then it will called as a parameterised
			// constructor.
		a = 20;
		s = "Ketan";

	}

	void show() // method
	{
		System.out.println(a);
		System.out.println(s);
	}
}

class B {

	public static void main(String[] args) {
		A n = new A();// obj creation.after parameterise construtor we have to delcler value
						// A(100,200)it is the value of a,b
		n.show();// call method.
	}

}// 3:37:43 / 8:58:23
