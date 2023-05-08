import java.util.Scanner;

public class Assg18 {

	public static void main(String[] args) {
		long n;
		int f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no n:");
		n=s.nextLong();
		
		for(int i=1;i<=n;i++) {
			f=f*i;
			
		}
		System.out.println("Factorial is:" +f);
	}

}
