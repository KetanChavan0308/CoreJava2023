
public class Assg5 {
	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 5, 7, 9 };
		int a2[] = { 2, 4, 3, 9, 7, 8 };
		int r = a1[0];
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					r = a1[i];
					System.out.print(" "+r);

				}

			}
		}

	}
}
