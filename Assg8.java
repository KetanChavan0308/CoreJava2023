import java.util.Scanner;

public class Assg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,a=0,c,r;
	System.out.println("Enter a string:");
    Scanner s=new Scanner(System.in);
    n = s.nextInt();
    c=n;
    while(n>0)
    {
    	r=n%10;
    	a=(a*10+r);
    	n=n/10;
    	
    }
    if (c==a)
        System.out.println(" is a palindrome");
     else
        System.out.println(" is not a palindrome");

	}
}
