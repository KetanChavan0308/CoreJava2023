import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
int b[]=new int[6];
//int a[]= {10,20,30,40,50,60,70,80,90,100};  //size of array is 10 a[10]
System.out.println("Enter array list");
Scanner s=new Scanner(System.in);

for(int n=0;n<=5;n++)
{
	b[n]=s.nextInt();
	//System.out.println(n);
}
Arrays.sort(b);
System.out.println("sorted array");
for(int i:b) {// value of a is asigning to i one by one
	System.out.println(i);
}

	}

}
