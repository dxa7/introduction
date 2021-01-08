package lambdas;

public class Lam3 {

	public static void main(String[] args) {
		
		MyMethod3 m = text -> {System.out.println(text);
		return text;};
		
		m.getText("Hi");
	}
	

}
