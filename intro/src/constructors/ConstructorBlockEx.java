package constructors;

public class ConstructorBlockEx {
	
	// static block vs constructor

	static { // static block

		System.out.println("Hello from Static Block!");
	}
	
	public ConstructorBlockEx() {
		System.out.println("Constructor 1 says Hi!");	// constructor with empty parameter
		
	}
	
	public ConstructorBlockEx(int c) {
		System.out.println("Constructor 2 says Hi!");
	}
	
	
	public static void main(String[] args) {
		
		//BlockConstructor ex1 = new BlockConstructor();
		//BlockConstructor ex2 = new BlockConstructor();
		//BlockConstructor ex3 = new BlockConstructor(15);
	}
	
}
