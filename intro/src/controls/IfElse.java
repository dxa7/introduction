package controls;

public class IfElse {

	public static void main(String[] args) {

		/*int age = 22;
		
		
		
		
		if (age > 18) {
			System.out.println("Access granted.");
			if(age > 21) {
				System.out.println("Legal adult.");
			}else {
				System.out.println("Not a legal adult");
			}
			
		}else {
			System.out.println("Access denied.");
		}*/
		
		
		
		
		String nationality;
		int age;
		
		nationality = "American";
		age = 68;
		
		
		if(nationality == "American" && age > 65) {
			System.out.println("gets social benefit");
			if(age >= 75) {
				System.out.println("%50 increase");
			}
		}else {
			System.out.println("does not get social benefit");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
