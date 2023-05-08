
public class Assg1 {

	public static void main(String[] args) {
		String input="i am lokesh ghode from pune";
		String output=" ";
		String[] a=input.split(" ");
		for(int i=0;i<a.length;i++) {
			char c=a[i].charAt(0);
			String c1=String.valueOf(c).toUpperCase();
			String sub=a[i].substring(1);
			 output=output+c1+sub;
			System.out.print(c1+sub + " ");
		}
		
	}

}
