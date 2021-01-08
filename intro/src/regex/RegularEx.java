package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

	public static void main(String[] args) {

		Pattern pattern =  Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("C++, Pyhton and Java are all OOP languages");

		boolean matchFound = matcher.find();

		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match is not found");
		}

	}

}
