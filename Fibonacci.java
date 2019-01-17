public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 12, x1 = 0, x2 = 1;

        
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(x1 + " + ");

            int sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
	}
}
