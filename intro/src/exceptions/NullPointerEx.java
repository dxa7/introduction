package exceptions;

public class NullPointerEx {

		
	public static void main(String[] args) {
		
		String a = "Hello";
		//String  a = null; will throw Null Pointer Exception. We are trying to perform an operation on a null object.
		a = a.concat("goodbye");
		System.out.println(a);
		
		
		
		String s = "";
		String n = null;
		
		
		System.out.println(n == null);
		System.out.println("Value of s is : " + s);
		System.out.println("Value of o is : " + n);

		
		
		
		
		
		
		
		
		
		
	}
}
