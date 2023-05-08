import java.util.Scanner;

public class Area_squar {

	public static void main(String[] args) {
		int h, w;
		double a;
		System.out.println("Enter hight of square h:");

		System.out.println("Enter the width w: ");

		Scanner s = new Scanner(System.in);
		h=s.nextInt();
		w=s.nextInt();
		a=h*w;
		System.out.println(a);
	}

}
