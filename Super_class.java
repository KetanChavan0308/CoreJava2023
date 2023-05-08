class X {//super class
	int a = 10;
	void show()//super method 
	{
		System.out.println("abc");
	}
}

class Y extends X {//Y subclass
	int a = 20;

	void show() {
		super.show();
		System.out.println("xyz");
		System.out.println(a);
		System.out.println(super.a);//super class: it is differentiate the super class and sub class  
	}
}
 class Super_class {

	public static void main(String[] args) {
		Y s = new Y();
		 s.show();

	}

}
// binding variables and methods together into a single unit and preventing them from being accessed by other classes.