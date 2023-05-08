import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int count=0;
		int n;
		System.out.println("Enter no:");
		Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	if(n%i==0) {
        		count++;
        		
        	}
        	
        }
        	if(count==2) {
        		System.out.println("Number  is Prime" );
        	}
        	else {
        		System.out.println("Number  is not Prime" );
        	}
	}

}
