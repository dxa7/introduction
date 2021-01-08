package lambdas;

public class LambdaEx {

	public static void main(String[] args) {

		MyMethod m = (text1, text2) -> {
			System.out.println(text1 + " + " + text2);
			return text1 + " + " + text2;
		};

		m.getText("Hello method!", "Goodbye method!");
	
		
	
		MyMethod m2 = m;
		m2.getText("Text1", "Text2");
	
	
	
		
		
	
	
	}

}
