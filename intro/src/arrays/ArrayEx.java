package arrays;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		// Simple Array Syntax
		String[] groceries = {"eggs", "milk", "butter"};
		System.out.println(Arrays.deepToString(groceries));
		
		// Array with declared size
	
		String[] fruitBowl = new String[4]; // This bowl can only hold 4 fruit
		
		fruitBowl[0] = "mango";		// Array index always starts from 0
		fruitBowl[1] = "strawberry"; 
		fruitBowl[2] = "apple";
		fruitBowl[3] = "cherry";
		
		
		for(String i : fruitBowl) {
			System.out.println(i);			//printing with enhanced loop
		}
		
		Integer[]numbers = new Integer
				[] {5,3,4};
		
		System.out.println(Arrays.asList(numbers));
		
		System.out.println(Arrays.toString(numbers));
	}
}
