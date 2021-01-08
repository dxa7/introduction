package exceptions;

public class FinallyEx {

		public static void main(String[] args)  {
			try {
				int a = 5/0;
				System.out.println(a);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("finally block says hi! I run everytime what's up?");
			}
			
			System.out.println("I am a test");
		}
}
