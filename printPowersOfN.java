
public class printPowersOfN {

	public static void main(String[] args) {
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
	}

	public static void printPowersOfN(int x, int y) {
		for (int i = 0; i <= y; i++) {
			int n = (int) Math.pow(x, i);
			System.out.print(n + " ");
		}
		System.out.println();
				
	}

}
