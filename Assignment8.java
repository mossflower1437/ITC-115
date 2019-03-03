
public class Assignment8 {

	public static void main(String[] args) {
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		System.out.println(isSorted(list1));
		
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		System.out.println(isSorted(list2));
	}

	public static boolean isSorted(double[] input) {
		
		for(int i=0; i<input.length-1; i++) {
			if(input[i] > input[i+1]){
				return false;
			}
		}
		return true;
	}
	
}
