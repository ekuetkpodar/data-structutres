package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StringArrayList {

	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<String>();
		word.add("ekue");
		word.add("zack");
		word.add("keith");
		word.add("ramil");
		word.add("thomas");
		word.add("lucas");

		System.out.println(word);
		Collections.sort(word);
		System.out.println(word);

		System.out.println("The first name in order is " + FindLow(word));
		System.out.println("The last name in order is " + FindHigh(word));
		
		word.remove(0);
		System.out.println(word);
		

	}

	/**Find last word alphabetically
	 * 
	 * @param arr
	 * @return
	 */
	public static String FindHigh(ArrayList<String> arr) {
		Collections.sort(arr);
		return arr.get(arr.size() - 1);

	}

	/**Find First word alphabetically
	 * 
	 * @param arr
	 * @return
	 */
	public static String FindLow(ArrayList<String> arr) {

		Collections.sort(arr);
		return arr.get(0);

	}

}
