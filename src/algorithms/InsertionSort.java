/**
 * 
 */
package algorithms;

/**
 * Class for applying insertion sort on a array
 * 
 * @author Ekue Kpodar
 *
 */
public class InsertionSort {

	/**Sort Array With Insertion sort 
	 * 
	 * @param array
	 * @return
	 */
	public static int[] Sort(int[] array) {
		int i, j, key, temp;
		for (i = 1; i < array.length - 1; i++) {
			key = array[i];
			j = i - 1;

			while (j >= 0 && key < array[j]) {

				swap(j, i, array);

				j--;
			}
		}

		return array;
	}

	private static int[] swap(int leftIndex, int rightIndex, int[] array) {
		int rightValue = array[leftIndex];
		int leftValue = array[rightIndex];

		array[leftIndex] = rightValue;
		array[rightIndex] = leftValue;

		return array;
	}

}
