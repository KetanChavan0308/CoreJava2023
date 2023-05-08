import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// Addition
          int a;
          double b,c;
          System.out.println("Enter 1st no");
          System.out.println("Enter 2st no");
          Scanner  s=new Scanner(System.in);
        		  a=s.nextInt();
                  b=s.nextDouble();
                  c=a+b;
                  System.out.println("Addition of two no:"  +c);
	}

}
