package LinkedList;

public class hasCycle {

	public static boolean hasCycle(Node head) {
		if(head == null) {
			Node fast = head.next;
			Node slow = head;
			
			while(fast != null && fast.next != null && slow != null) {
				if(fast == slow) {
					return true;
				}
				
				fast = fast.next.next;
				slow = slow.next;
			}
			
		}
		return false;
	}
}
