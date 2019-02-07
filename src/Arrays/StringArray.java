package Arrays;

public class StringArray {

	public static void main(String[] args) {
		String[] arr = { "aaa", "bbb", "ccc", "ddd", "eee" };
		Display(arr);

		String random[] = { "zack", "john", "ann", "keith", "ekue" };
		Display(random);
		random = Sort(random);
		Display(random);
		
		
		

	}

	public static void Display(String[] arr) {
		for (String current : arr) {
			System.out.print(current + "\t ");
		}
		System.out.println();
	}

	public static String[] Swap(String arr[], int left, int right) {
		String leftValue = arr[left];
		String rightValue = arr[right];

		arr[left] = rightValue;
		arr[right] = leftValue;

		return arr;
	}

	public static String[] Sort(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; i < arr.length; i++) {
				if (arr[j].compareTo(arr[i]) == 1) {
					Swap(arr, i, j);
				}
			}
		}
		return arr;
	}

}
