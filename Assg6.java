
public class Assg6 {

	public static void main(String[] args) {
		int n[]= {15, 79, 48, 21, 43, 11, 18, 13 };
		int m1=0;
		int m2 = 0;
		for (int i=0;i<n.length; i++)
		{
			if (m1 < m2)
			{
				m2 = m1;
				m1 = n[i];
			}
			else if (m2 < n[i])
			{
				m2 = n[i];
			}
		}
		System.out.println("largest number: " + m1);
		System.out.println("second largest number: " + m2);
			
		}

	}


