
public class Assg14 {

	public static void main(String[] args) {
		String input = "elephant";
		  char s = 'e';             
		  
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == s)
		      count++;
		  }
		  
		  System.out.print( "Count of char   "   +s);
		  System.out.print(" is " +count);
	}

}
