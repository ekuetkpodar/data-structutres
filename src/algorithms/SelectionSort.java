package algorithms;

/**
 * Create a selection sort algorithms
 * 
 * @author Ekue Kpodar
 *
 */
public class SelectionSort {

	private static int[] swap(int left, int right, int[] array) {
		int leftValue = array[right];
		int rightValue = array[left];

		array[left] = rightValue;
		array[right] = leftValue;

		return array;
	}

	/**Sort array with selection sort
	 * 
	 * @param array
	 * @return
	 */
	public static int[] Sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int temp = i;
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[temp] > array[j]) {
					swap(temp, j, array);
				}
			}
		}
		return array;
	}

}
