package modifiers;

public class StaticBlockEx {

	static int x;

	static {

		x = 5;

	}

	public static void main(String[] args) {
		System.out.println("X is : " + x);

	}

}
