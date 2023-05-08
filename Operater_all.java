import java.util.Scanner;

public class Operater_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a, b;
       System.out.println("Enter value of a and b ");
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       System.out.println(a==b); //20= 30
       System.out.println(a!=b);//20!=30
       System.out.println(a>b);//20>30
       System.out.println(a<b);//20<30
       System.out.println(a>=b);//20>=30
       System.out.println(a<=b);//20<=30
       System.out.println(a==b && a<b);
       System.out.println(a!=b || a==b);
       System.out.println(!(a>b));
	}

}
