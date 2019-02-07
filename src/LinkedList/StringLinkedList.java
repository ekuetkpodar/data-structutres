package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class StringLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ekue");
		list.add("zack");
		list.add("julia");
		list.add("keith");
		list.add("tom");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.add(3, "Racheal");
		System.out.println(list);

	}

}
