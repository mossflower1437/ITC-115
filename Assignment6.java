import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		File file = new File("boysgirls.txt");
		try {
			Scanner input = new Scanner(file);
			boyGirl(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void boyGirl(Scanner scanner) {
		int boycount = 0;
		int girlcount = 0;
		int totalcount = 0;
		boolean isBoy = true;
		
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			String[] ary = input.split(" ");
			int level = Integer.parseInt(ary[1]);
			
			if (isBoy) {
				boycount++;
				totalcount += level;
			}
			
			else {
				girlcount++;
				totalcount -= level;
			}
			
			isBoy = !isBoy;
		}
		
		totalcount = Math.abs(totalcount);
		
		System.out.println(boycount + " boys, " + girlcount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + totalcount);
		
		
		
	}

}
