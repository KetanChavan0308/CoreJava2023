import java.util.Scanner;

public class switch_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a,b,c,ch;
 System.out.println("Enter value =");
 Scanner s=new Scanner(System.in);
 a=s.nextInt();
 b=s.nextInt();
 System.out.println("Enter your choice");
 ch=s.nextInt();
 switch(ch) {
        case 1: c=a+b;
        	System.out.print("Addition  "    +c);
	            break;
        case 2: c=a-b;
        	System.out.println("sub   "    +c);
        	break;
        case 3: c=a*b;
        	System.out.println("Mul  "    +c);
        	break;
        case 4:c=a/b;
        	System.out.println("div  "    +c);
        case 5:c=a%b;
             System.out.println("Reminder  " +c);
         default:System.out.println("Invalid choice");
        	
 }
 
	}

}
