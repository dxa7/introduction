package exceptions;

public class RunTimeExceptionEx {

	static int nums[] = { 12, 5, 3, 0 }; // Creating a number array

	static int intDivide(int n1, int n2) { // Creating a divide method
		return (n1 / n2);
	}

	public static void main(String[] args) {

		try {
			int result = intDivide(18, nums[4]); // Index 4 does not exist so this will throw an exception
			System.out.println("The answer is : " + result);

		} catch (ArithmeticException e) { // Catching a specific exception
			System.out.println("Cannot divide by 0 ");

		} catch (ArrayIndexOutOfBoundsException e) { // Catching a specific exception
			System.out.println("Array index is not available");

		} catch (Exception e) { // Catching any other exception that is not expected
			e.printStackTrace(); // Print out the name and line of the exception
			// throw e; // Stop the other code from continuing when this exception is thrown

		} finally { // finally block will execute regardless if an exception is thrown or not
			System.out.println("the finally block continues...");
		}

		System.out.println("Continuing code...");
	}

}
