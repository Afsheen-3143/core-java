package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("hema");
		al.add(null);
		al.add("raj");
//		LinkedList<String> ll=new LinkedList<>();
		List<String> ll=new LinkedList<>();
//		Collection<String> ll=new LinkedList<>();
		ll.add("ss");
		ll.add("ff");
		ll.add(0, null);
		ll.addAll(0,al);
		System.out.println(ll);
		ll.set(0, null);
		System.out.println(ll);
		for(String s:ll) {
			System.out.println(s);
		}
Collections.synchronizedList(ll);
	}

}
