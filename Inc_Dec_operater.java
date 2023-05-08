import java.util.Scanner;

public class Inc_Dec_operater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        System.out.println("Enter the value of a");
        Scanner s =new Scanner(System.in);
        a=s.nextInt();
        a+=10;
        System.out.println( a-- );
        System.out.println( --a );
        System.out.println( a++ );
        System.out.println( ++a );
        
	}

}
