
public class Assg3 {

	public static void main(String[] args) {
		int[] a = { -1, 2, 1, 3, 5, 6, 2, 0 };
		int sum = 4;
		for (int i : a) {
			for (int j : a) {
				if (sum == i + j) {
					System.out.println("pair of add =4 is:");
					System.out.println(i + " ," + j );

				}
			}

		}

	}

}
