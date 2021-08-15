package coddingTask;

public class Task7Abdul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Task#7-1: Find the maximum and minimum number in the array.
				int[] array = { 12, 24, 67, 800, 99 };
				int maximum = array[0];
				int minimum = array[0];
				for (int i = 0; i < array.length; i++) {
					if (array[i] > maximum) {
						maximum = array[i];
					} else if (array[i] < minimum) {
						minimum = array[i];
					}
				}
				System.out.println(" The largest number in one dimensional array is = " + maximum+ " and the smallest number is = " + minimum);
				System.out.println();
				
				System.out.println("--------------------------------");
				// Task#7-2: find maximum and minimum number in two dimensional array:
				int[][] twoDarr = { { 14, 24, 67, 81, 99 }, { 12, 8, 87, 21, 19 }, { 10, 20, 65, 71, 400 }, };
				int max = twoDarr[0][0];
				int min = twoDarr[0][0];
				for (int i = 0; i < twoDarr.length; i++) {
					for (int j = 0; j < twoDarr[i].length; j++) {
						if (twoDarr[i][j] > max) {
							max = twoDarr[i][j];
						} else if (twoDarr[i][j] < min) {
							min = twoDarr[i][j];
						}
					}
				}
				System.out.println("The largest number in two dimensional array is = " + max + " and the smallest number is = " + min);

	}

}
