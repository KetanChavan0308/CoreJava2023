import java.util.Scanner;

public class Input_Array {

	public static void main(String[] args) {
		int size, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size = s.nextInt();
		int a[] = new int[size];
		System.out.println(size);
		System.out.println("Enter array list");
		Scanner k = new Scanner(System.in);
		for(int n=0;n<5;n++)
		{
			a[n]=s.nextInt();
		}
		for (int x : a) {
			System.out.println(x);
		}

	}

}
