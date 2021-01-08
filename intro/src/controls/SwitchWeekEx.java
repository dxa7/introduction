package controls;

import java.util.Random;

public class SwitchWeekEx {

	
	public static int getRandomDay() {
		int[] dayNum = { 0, 1, 2, 3, 4, 5, 6 };
		int r = new Random().nextInt(dayNum.length);
		System.out.println("Random day number is : " + r); 
		return r;

	}
	
	public static void main(String[] args) {
		
		switch (getRandomDay()) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
			break;
		case 2:
			System.out.println("Wednesday");
			break;
		case 3:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
			
		}
	}
}
