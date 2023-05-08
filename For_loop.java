import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter Value of a:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();

		for (int i = 1; i <= 5; i++) 
		{
		
			System.out.println(a *i);
		}

	}

}
