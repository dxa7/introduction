package generics;

import java.util.HashMap;

public class GenericsEx<T, V> {

	T ob;
	V ob2;

	 HashMap<T, V> map = new HashMap<>();

	 GenericsEx(T ob, V ob2) {
		this.ob = ob;
		this.ob2 = ob2;
	}

	void showType() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob2.getClass().getName());

	}

	

}
