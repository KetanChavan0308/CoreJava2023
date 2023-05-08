import java.util.Scanner;

public class do_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.print("Enter any No::");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		do {
			System.out.print(a+ " ");
			a=a+1;
		  }
		while (a<=10);

	}

}
