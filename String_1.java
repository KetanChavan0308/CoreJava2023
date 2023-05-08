
public class String_1 {

	public static void main(String[] args) {
		String s = "Future";
		String s1 = new String("Future");
		String a = "Future";
		System.out.println("Upper case:" + s.toUpperCase());// convert into uppercase later
		System.out.println("Lower Case:" + s.toLowerCase());// to convert into lower case later
		System.out.println("Lower Case: " + s1.toLowerCase());
		System.out.println("Upper case:" + s1.toUpperCase());
		System.out.println(s1==a);
		/*
		 * if (s.equals(s1))// compaire String wrt length
		 * 
		 * System.out.println("String are Equal"); String b = s.concat(a);
		 * System.out.println(" " + b); System.out.println("String is concatenated"); }
		 * else { System.out.println("String are Not Equal"); }
		 */
	}

}
