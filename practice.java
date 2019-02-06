import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		longestName(console, 4);
		
	}
	
	public static void longestName(Scanner scanner, int namecount) {
		String elName = "";
		
		for (int i = 0; i < namecount; i++) {
			
			System.out.print("name #" + (i + 1) + "?");
			String input = scanner.nextLine();
			
			
			
			if (elName.length() < input.length()) {
				elName = input;
			}
		}
		
		System.out.print(elName + "'s name is the longest");
	}
}
