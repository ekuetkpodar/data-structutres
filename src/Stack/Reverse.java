package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse {
	
	/**Reverse a list
	 * 
	 * @param list 
	 * 			The List to reverse
	 * @return
	 */
	public static ArrayList<String> ReverseArrayList(ArrayList<String> list) {
		ArrayList<String> result = new ArrayList<String>();

		Stack<String> stack = new Stack<>();

		for (String c : list) {
			stack.add(c);
		}

		while (!stack.isEmpty()) {
			result.add(stack.pop());
		}

		return result;

	}

}
