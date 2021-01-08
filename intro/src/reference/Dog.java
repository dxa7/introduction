package reference;

public class Dog extends Animal {

	void eat() {
		System.out.println("Eat dog treat");
	}

	void bark() {
		System.out.println("Woof");
	}

	void activity() {
		bark();
		super.eat();
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.activity();
	}
}
