package Arrays;

import java.lang.reflect.Array;

public class CharArrays {

	public static void main(String[] args) {
		char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f' };
		printArray(alpha);

		System.out.println();
		System.out.println("The Lenght of the array " + alpha.length);

		char[] random = { 'q', 'm', 'z', 'a', 'x', 'c' };
		printArray(random);

		System.out.println();
		System.out.println("Sort Random Array");
		random = sort(random);
		printArray(random);

	}

	/**
	 * Print Array
	 * 
	 * @param arr The char array
	 */
	public static void printArray(char[] arr) {
		for (char current : arr) {
			System.out.print(current + "\t");
		}
	}

	public static char[] sort(char[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j] > arr[i]) {
					swap(arr, i, j);
				}
			}
		}

		return arr;

	}

	/**
	 * Swap Values in a array
	 * 
	 * @param arr        The Array
	 * @param leftindex  The left index
	 * @param rightindex The Right Index
	 * @return
	 */
	public static char[] swap(char[] arr, int leftindex, int rightindex) {

		char leftValue = arr[leftindex];
		char rightValue = arr[rightindex];
		arr[leftindex] = rightValue;
		arr[rightindex] = leftValue;

		return arr;

	}

}
