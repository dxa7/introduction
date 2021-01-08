package basics;

public final class CalculatorEx {

	int x;
	int y;
	int sum;


	CalculatorEx(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void add() {
		sum = x + y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		CalculatorEx calc = new CalculatorEx(5,12);
		calc.add();
		
	}
	
}
