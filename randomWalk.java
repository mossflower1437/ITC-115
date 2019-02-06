import java.util.Random;

public class randomWalk {

	public static void main(String[] args) {
		randomWalk();

	}
	
	public static void randomWalk() {
		
		int position = 0;
		int maxposition = 0;
		Random rand = new Random();
		
		
		while (position != 3 && position != -3) {
			
			System.out.println("position = " + position);
			int randNum = rand.nextInt(2);
			
			if (randNum == 1) {
				position++;
			}
			
			else {
				position--;
			}
	
			
			if (position > maxposition)  {
				maxposition = position;
			}
			
			
	
		}
		System.out.println("position = " + position);
		System.out.print("max position = " + maxposition);
	}
}