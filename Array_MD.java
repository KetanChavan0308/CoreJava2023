import java.util.Scanner;

public class Array_MD {

	public static void main(String[] args) {
		//int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int a[][]=new int [3][3];
		System.out.println("Enter array element");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
          for(int j=0;j<3;j++)
          {
        	 a[i][j]=s.nextInt();         
        	  }
	}
       System.out.println("Matrix is::");
       for(int i=0;i<3;i++)
		{
         for(int j=0;j<3;j++)
         {
       	  System.out.print(a[i][j]+"");       
       	  }
         System.out.println();
	}
}
}