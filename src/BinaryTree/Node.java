package BinaryTree;
/**Create A Binary Tree
 * 
 * @author Ekue Kpodar
 *
 */

public class Node {
	Node left, right;
	int data;

	/**Binary Tree Constructor
	 * 
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
	}

	/**Insert Item into tree
	 * 
	 * @param value
	 */
	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}

	/**Check if a given item is in a tree
	 * 
	 * @param value
	 * 			The  value of the node
	 * @return
	 * 		tree if the item is in the list
	 */
	public boolean contains(int value) {
		if (value == data) {
			return true;
		} else if (value < data) {
			if (left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}

	/**Print item in a array from left to right
	 * 
	 */
	public void printInorder() {
		if (left != null) {
			left.printInorder();
		}

		System.out.println(data);

		if (right != null) {
			right.printInorder();
		}
	}

	/**Print item in a array right to left
	 * 
	 */
	public void printPostOrder() {
		if (right != null) {
			right.printPostOrder();
		}

		System.out.println(data);

		if (left != null) {
			left.printPostOrder();
		}
	}

}
