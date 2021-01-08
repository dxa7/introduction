package generics;


public class GenericsMain {

	
	public static void main(String[] args) {
		GenericsEx<Integer, Double> obj = new GenericsEx<>(10,20.0);
		
		obj.showType();
		
		
		
	}
}
