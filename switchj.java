import java.util.Scanner;

public class switchj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ch;

		System.out.println("Enter your choice");
		Scanner s = new Scanner(System.in);
		ch = s.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Mango Juse");
			System.out.println("Enter your choice");
			ch = s.nextInt();
			switch (ch) {
			case 1:{
				System.out.println("dark");
				break;
			}
			case 2:{
				System.out.println("light");
				break;
			}
			}
		case 2:{
			System.out.println("orange juse");
			
		}
		break;
		default:{
			System.out.println("Sorry No choice");
		}
		}

	}

}
