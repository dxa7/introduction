package lambdas;

public class Lam2 {

	public static void main(String[] args) {
		
	Method2 m = (x,y) -> {
		System.out.println(x+y);
		return x+y;
		};
	
	m.getSum(4, 6);
	m.getSum(2, 3);
	
	
	}
}
