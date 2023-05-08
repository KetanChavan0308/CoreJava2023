import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
System.out.println("Enter any no:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
while(a>=0) {
	if(a>=100) {
		System.out.println("three digit no");
		break;
	}
	else if(a>=10&&a<=99) {
		System.out.println("two digit no");
		break;
	}
	else {
		System.out.println("single  digit no");
		break;
	}
}
System.out.println("while loop ended");
	}

}
