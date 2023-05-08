
public class Assg12 {

	public static void main(String[] args) {
		 
		      String s = "Welcome to Future Automation";
		      String s1[]=s.split(" ");
		      
		      String a= ""; 
		      for (int i = s1.length - 1; i >= 0; i--) { 
		        a += s1[i] + " "; 
		      } 
		      System.out.println(a); 

	}

}
