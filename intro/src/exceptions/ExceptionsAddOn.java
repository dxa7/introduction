package exceptions;


public class ExceptionsAddOn {

	int division(int a, int b) throws ArithmeticException{  
		int r = a/b;
		return r;
	}
	
	public static void main(String[] args) {
		
		ExceptionsAddOn obj = new ExceptionsAddOn();
		try{
		   System.out.println(obj.division(15,0));  
		}
		catch(ArithmeticException e){
		   System.out.println("You shouldn't divide number by zero");
		}
		
	/*	try {
			FileReader file = new FileReader("somefile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} */
	
	}
}
