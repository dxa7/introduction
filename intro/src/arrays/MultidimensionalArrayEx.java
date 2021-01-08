
package arrays;

import java.util.Arrays;

public class MultidimensionalArrayEx {
	
	

	public static void main(String[] args) {

		// 2D Array Example as a Lottery Ticket
		// [ ROW ] [ COLUMN ] 
		int[][] lotteryCard = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		// We can use Arrays.deepToString to print out 2D and 3D arrays
		System.out.println(Arrays.deepToString(lotteryCard));

		// We have to use two enhanced loops for 2D arrays
		for (int[] a1 : lotteryCard) {
			for (int i : a1) {
				System.out.println(i);
			}

			
			//2D Array with set dimension size
			int[][] numPad = new int[3][3];
			numPad[0][0] = 1;
			numPad[0][1] = 2;
			numPad[0][2] = 3;
			numPad[1][0] = 4;
			numPad[1][1] = 5;
			numPad[1][2] = 6;
			numPad[2][0] = 7;
			numPad[2][1] = 8;
			numPad[2][2] = 9;
			
			
			//System.out.println(Arrays.deepToString(numPad));
		}
	}
}
