package controls;

public class Loops {

	public static void main(String[] args) {
		
		// while loop
		
		int a = 0;
		
		/*while( a <= 10) {
			System.out.println(a);
			a++;

		}*/
		
		// do while
		
		do {
			System.out.println("I run at least once " + a);
			a++;
		}
		while( a > 10 );
		
		// for loop
		
		for(; a <= 10 ; a++) {
			System.out.println(a);
		}
		
		
		
		
	}
}
