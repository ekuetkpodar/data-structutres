package Queue;

import java.util.Stack;

/**
 * Create Queue with two stacks
 * 
 * @author Ekue Kpodar
 *
 * @param <T>
 */

public class MyQueue<T> {
	private Stack<T> stackNewestOnTop = new Stack<T>();
	private Stack<T> stackOldestOnTop = new Stack<T>();

	/**
	 * Add item
	 * 
	 * @param value
	 */
	public void enqueue(T value) {
		stackNewestOnTop.push(value);

	}

	/**
	 * Get The Oldest Item
	 * 
	 * @return
	 */
	public T peek() {
		shiftStacks();
		return stackOldestOnTop.peek();
	}

	private void shiftStacks() {
		if (stackOldestOnTop.isEmpty()) {
			while (!stackNewestOnTop.isEmpty()) {
				stackOldestOnTop.push(stackNewestOnTop.pop());
			}
		}
	}

	public T dequeue() {
		shiftStacks();
		return stackOldestOnTop.pop();

	}

}
