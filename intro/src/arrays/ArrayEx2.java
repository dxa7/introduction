package arrays;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		System.out.println("My current LoadOut!");

		String loadOut[] = new String[5];
		loadOut[0] = "Assault Rifle";
		loadOut[1] = "Combat Shotgun";
		loadOut[2] = "Tac SMG";
		loadOut[3] = "Mini Shield";
		loadOut[4] = "Medkit";
		

		System.out.println(Arrays.deepToString(loadOut));
		
		
		// for(int i=0; i < loadOut.length; i++) { System.out.println(loadOut[i]); }

		String backpack[] = { "Assault Rifle", "Combat Shotgun", "Tac SMG", "Mini Shield", "Medkit" };
		int damage[] = { 15, 20, 57, 100, 120, 200 };

		System.out.println("Switch to : " + backpack[1]);
		System.out.println(damage[5] + " damage dealt");

	}
}
