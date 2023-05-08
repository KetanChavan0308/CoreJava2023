import java.util.Scanner;

public class Calculator_Method {

	public static void main(String[] args) {

		System.out.println("***************Simple Calculator******************");

		System.out.println("\n Enter your Choice:");
		System.out.println("\n1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");

		System.out.print("\nWhich action u have to perform: ");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		System.out.println();

		if (choice == 1) {
			addition();
		} else if (choice == 2) {
			subtraction();
		} else if (choice == 3) {
			division();
		} else if (choice == 4) {
			multiplication();
		}

		System.out.println();


	}

	public static void addition() {

		int x, y;
		Scanner s = new Scanner(System.in);

		System.out.println("Addition");

		System.out.print("First Number: ");
		x = s.nextInt();

		System.out.print("Second Number: ");
		y = s.nextInt();

		System.out.println("\nSum: " + x + " + " + y + " = " + (x + y));
	}

	public static void subtraction() {
		int x, y;
		Scanner s = new Scanner(System.in);

		System.out.println("Substraction");

		System.out.println("First Number: ");
		x = s.nextInt();

		System.out.println("Second Number: ");
		y = s.nextInt();

		System.out.println("\nSub: " + x + " - " + y + " = " + (x - y));
	}

	public static void division() {
		int x, y;
		Scanner s = new Scanner(System.in);

		System.out.println("Division");

		System.out.println("First Number: ");
		x = s.nextInt();

		System.out.println("Second Number: ");
		y = s.nextInt();

		System.out.println("\nDiv: " + x + " / " + y + " = " + (x / y));
	}

	public static void multiplication() {
		int x, y;
		Scanner s = new Scanner(System.in);

		System.out.println("Multiplication");

		System.out.println("First Number: ");
		x = s.nextInt();

		System.out.println("Second Number: ");
		y = s.nextInt();

		System.out.println("\nMul: " + x + " * " + y + " = " + (x * y));
	}
	

}
