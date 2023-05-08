import java.util.Scanner;

public class Avg_of_n {

	public static void main(String[] args) {
		float sum = 0;
		System.out.println("Enter  size of array ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		float a[] = new float[n];
		System.out.println("Enter array elements"    + n);
		for (int i = 0; i < n; i++) {
			a[i] = s.nextFloat();
			sum = sum + a[i];
		}
		double x = sum / n;
		System.out.println("Average of no:"  +x);
	}

}
