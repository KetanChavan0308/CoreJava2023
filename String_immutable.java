
public class String_immutable {

	public static void main(String[] args) {
		String s = "Ketan";// immutable
		String a = "Chavan";// immutable
		String b = s.concat(" " + a); // join two string
		System.out.println(b);

	}

}
