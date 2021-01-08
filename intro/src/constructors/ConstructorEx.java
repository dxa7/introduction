package constructors;

public class ConstructorEx {

	String myName;
	int myAge;

	public ConstructorEx(String myName, int myAge) { 
		this.myName = myName;
		this.myAge = myAge;
		//System.out.println("My name is : " + myName + "\nMy age is : " + myAge);		//We could do this too!
		
	}
	
	void info() {
		System.out.println("My name is : " + myName + "\nMy age is : " + myAge);
	}

	public static void main(String[] args) {
		ConstructorEx c = new ConstructorEx("Jane", 24);
		c.info();
	}

}
