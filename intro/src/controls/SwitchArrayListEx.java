package controls;

import java.util.ArrayList;
import java.util.Random;

public class SwitchArrayListEx {

	
	public static void main(String[] args) {
		ArrayList<String> yearMonths = new ArrayList<String>();
		yearMonths.add("January");
		yearMonths.add("February");
		yearMonths.add("March");
		yearMonths.add("April");
		yearMonths.add("May");
		yearMonths.add("June");
		yearMonths.add("July");
		yearMonths.add("August");
		yearMonths.add("September");
		yearMonths.add("October");
		yearMonths.add("November");
		yearMonths.add("December");

		Random rnd = new Random();
		String randomMonth = yearMonths.get(rnd.nextInt(yearMonths.size()));
		//System.out.println(randomMonth); 

		
		switch (randomMonth) {
		case "December":
		case "January":
		case "February":
			System.out.println("It is Winter and the month is: " + randomMonth);
			break;

		case "March":
		case "April":
		case "May":
			System.out.println("It is Spring and the month is: " + randomMonth);
			break;

		case "June":
		case "July":
		case "August":
			System.out.println("It is Summer and the month is: " + randomMonth);
			break;

		case "September":
		case "October":
		case "November":
			System.out.println("It is Fall and the month is: " + randomMonth);
			break;
		}

	}

}
