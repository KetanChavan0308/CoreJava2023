import java.util.Scanner;
public class Assg7 {

	public static void main(String[] args) {
		 String str, rev = "";
	      
	 
	      System.out.println("Enter a string:");
	      Scanner s=new Scanner(System.in);
	      str = s.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	}
	
	
}
