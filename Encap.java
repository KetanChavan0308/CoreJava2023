import java.util.Scanner;

class Bank {
	private double bal = 100000;
	private int pwd;

	public void deposit(double money) {
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if (pwd == 123) {
			bal = bal + money;
			System.out.println("deposit money:" + money);
			System.out.println("total balance" + bal);
		} else {
			System.out.println("Incorrect Password");
		}
	}

	public void withdraw(double money) {
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if (pwd == 123) {
			bal = bal - money;
			System.out.println("widrowal money:" + money);
			System.out.println("total balance" + bal);
		} else {
			System.out.println("Incorrect Password");
		}
	}

	public void check(double money) {
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if (pwd == 123) {

			System.out.println("total balance" + bal);
		} else {
			System.out.println("Incorrect Password");
		}
	}
}

public class Encap {

	public static void main(String args[]) {
		Bank b = new Bank();// object creation
		int ch;
		System.out.println("Enter Your Choice:");
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.check balance");
		System.out.println("Enter your Choice:");
		Scanner s2 = new Scanner(System.in);
		ch = s2.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Enter amout to deposit:");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			b.deposit(ch);
			break;
		case 2:
			
			System.out.println("Enter amout to withdeaw:");
			Scanner n=new Scanner(System.in);
			ch=n.nextInt();
			b.withdraw(ch);
			break;
		case 3:
			b.check(ch);
			break;
		default:
			System.out.println("Invalid choice");
		}
		do {
		System.out.println("Do You want to continue y/n");
		Scanner sc = new Scanner(System.in);
	     ch= sc.nextInt();
		}
		while (ch == 'y' || ch == 'n');

	}

}
