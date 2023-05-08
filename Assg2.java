import java.util.Scanner;

public class Assg2 {

	public static void main(String[] args) {
		int First_No = 0;
		int Sec_No = 1;
		int next;
		int n;
		int i=0;
		System.out.println("Enter the value of n for fibonacci :  ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		 
		while (i < n) {
			if (i <= 1) {
				next = i;
			} else {
				next = First_No + Sec_No;
				First_No = Sec_No;
				Sec_No = next;

			}
System.out.println(next);
i++;
		}


	}

}
