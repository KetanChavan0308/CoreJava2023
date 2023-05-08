import java.util.Scanner;

public class For_Each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]=new int[5];
		System.out.println("Enter the value of array:");
		Scanner s=new Scanner(System.in);
	
		//for each loop
		for (int i:n) // access every value one by one in array.
		{
			n[i]=s.nextInt();
			System.out.println(i);
			
		}

	}

}
