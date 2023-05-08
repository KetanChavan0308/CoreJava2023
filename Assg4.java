
public class Assg4 {

	public static void main(String[] args) {
		{

			int[] a = new int[] { 1, 6, 9, 3, 56,65 };
			int max = a[0];
			for(int i = 1; i < a.length;i++)
			{
				if(a[i] > max)
				{
					max = a[i];
				}
			}
			
			System.out.println("The Given Array Element is:");
			for(int i = 0; i < a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			System.out.println(" Largest Number From Given Array  is:" + max);
				}

	}
}