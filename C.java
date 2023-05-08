class P {
	int a=10;
	String b="chavan";

	P(int x, String y) {//paramereized const;
		x = a;
		y = b;
		System.out.println(x + "" + y);
	}
	P(P ref) {// copy const used for copy obj from class p

		a=ref.a;
		b=ref.b;
		System.out.println(a + "" + b);
	}

	
	void show() {
		System.out.println(a + "" + b);
	}
}

public class C {//if we add private construtor then we can not aacess data of private class

	public static void main(String[] args) {
		P s = new P(10,"Ketan");
		P s2=new P(s);//copy s obj content into s2
		s.show();
		P ref = new P(2, "Ketan");
	}

}
