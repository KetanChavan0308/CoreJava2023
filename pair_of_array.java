
public class pair_of_array {

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, 0, -7, 4, 2 };
		int sum = 6;
		for (int i : a) {
			for (int j : a) {
				if (sum == i + j) {
					System.out.println("pair of add =6 is:");
					System.out.println(i + " ," + j );

				}
			}

		}
	}

}
