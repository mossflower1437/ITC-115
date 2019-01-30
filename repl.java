
public class repl {

	public static void main(String[] args) {
		System.out.print(repl("hello", 3));
			
	}
	
	public static String repl(String word, int reps) {
		 String concat = "";
		    
		    for (int i = 0; i < reps; i++) {
		        concat += word;
		    }
		    
		    return concat;
	}

}
