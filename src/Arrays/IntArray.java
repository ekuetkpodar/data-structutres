package Arrays;

import java.lang.reflect.Array;

public class IntArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		display(arr);

		int random[] = { 23, 28, 56, 30, 79, 100, 65, 12 };
		System.out.println();
		display(random);
		random = Sort(random);
		System.out.println();
		display(random);

		random = SortHighToLow(random);
		System.out.println();
		display(random);

		random = SortHighToLow(random);
		System.out.println(FindHighValue(random));

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + "\t ");
		}

	}

	/**
	 * Swap values in arr
	 * 
	 * @param arr   The array
	 * @param left  The left index
	 * @param right The right index
	 * @return
	 */
	public static int[] swap(int[] arr, int left, int right) {
		int rightValue = arr[right];
		int leftValue = arr[left];

		arr[left] = rightValue;
		arr[right] = leftValue;

		return arr;
	}

	/**
	 * Sort arry
	 * 
	 */
	public static int[] Sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	/**
	 * Sort arry
	 * 
	 */
	public static int[] SortHighToLow(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	/**
	 * Find Highest Value
	 * 
	 * @param arr
	 * @return
	 */
	public static int FindHighValue(int[] arr) {
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * Find lowest Value
	 * 
	 * @param arr
	 * @return
	 */
	public static int FindLowValue(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}
}
