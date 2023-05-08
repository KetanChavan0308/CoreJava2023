import java.util.Scanner;

public class IF_Con {

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter value of a&b:");
		Scanner i = new Scanner(System.in);
		a = i.nextInt();
		b = i.nextInt();
		c = a + b;
		System.out.println(c);
		if (a == b) {
			System.out.println("Equal");
		} 
		else {
			System.out.println("NOT Equal");
		}

	}

}
