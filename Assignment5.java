import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner scans = new Scanner(System.in);
		printGPA(scans);
		
	}
	
	public static void printGPA(Scanner scanner) {
		System.out.print("Enter a student record: ");
		String input = scanner.nextLine();
		String[] ary = input.split(" ");
		
		int total = 0;
		for (int i = 2; i < ary.length; i++) {
			total += Integer.parseInt(ary[i]);
		}
		
		float avg = total/Integer.parseInt(ary[1]);
		
		System.out.println(ary[0] + "'s grade is " + avg);
		
	}

}
