
public class Assg11 {

	public static void main(String[] args) {
		String s1="Welcome to Future Automation";
		String s2=" ";
		int i,l;
		l=s1.length();
		
		for(i=l-1;i>0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}

}
