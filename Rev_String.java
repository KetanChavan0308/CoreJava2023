
public class Rev_String {

	public static void main(String[] args) {
		String a="level";
		String b="level";
		String r="";
		for(int i=0;i<a.length();i++)
		{
			r=a.charAt(i)+r;
			
			
		}
		System.out.println("orignal String:"  +a);
		System.out.println("reverce String:"  +r);
	
		if(a.equals(b)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

}
