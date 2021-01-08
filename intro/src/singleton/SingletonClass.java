package singleton;

public class SingletonClass {

	// Static member holds only one instance of the SingletonClass
	private static SingletonClass singletonInstance;

	// Private constructor prevents any other class from instantiating 
	private SingletonClass() {

	}

	// Providing a Global point of access
	public static SingletonClass getSingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonClass();
			System.out.println("Creating new Singleton Instance");

		} return singletonInstance;
	}
	
	
	public void printSingleton() {
		System.out.println("Inside the Singleton ... Hello! ");
	}

}
