
public class Person {
	int age = 21;// properties
	int weight = 60;// properties
	String String_colour = "Light";// properties

	void eat()// This is behaviours of class
	{
		System.out.println("I am eatting");
	}

	void sleep()// This is behaviours of class
	{
		System.out.println("I am sleeping");
	}

	void talking()// This is behaviours of class
	{
		System.out.println("I am Talking");
	}

	public static void main(String[] args) {
		Person s = new Person();// Object creation
		System.out.println(s.age);
		System.out.println(s.weight);
		System.out.println(s.String_colour);

		s.eat();
		s.sleep();
		s.talking();
	}

}
