package basics;

public class MethodEx {

	public static int sumOfThis( int a , int b) {
		int sum;
		sum = a + b ;
		return sum;
		
	}
	public static void main(String[] args) {

		
		int finalSum = sumOfThis(4,12);
		System.out.println(finalSum);
		
	}
}
