package basics;

import java.util.Scanner;

public class AssertEx {

	public static void main(String[] args) {
	
	
		try (Scanner scanner = new Scanner( System.in )) {
			System.out.print("Enter ur age ");  
			    
			  int value = scanner.nextInt();  
			  assert value>=18:" Not valid";  
			  
			  System.out.println("value is "+value);
		}  
	
	
	}
}
