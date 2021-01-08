package basics;

import java.util.ArrayList;

public class Java8 {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		list.forEach(i -> System.out.println(i));
		
		//list.forEach(System.out::println);
	}
	
}
