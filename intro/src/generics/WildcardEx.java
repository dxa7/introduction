package generics;

import java.util.Arrays;
import java.util.List;

public class WildcardEx {

	private static void printList(List<?> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {

		// Integer List
		List<Integer> intList = Arrays.asList(10, 20, 30, 40);

		// Double list
		List<Double> doubleList = Arrays.asList(11.5, 13.6, 67.8, 43.7);

		printList(intList);
		printList(doubleList);

	}

}
