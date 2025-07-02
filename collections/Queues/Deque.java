package queues;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Collection;

public class Deque {
	public static void main(String[] args) {
		ArrayDeque<String> aq=new ArrayDeque<>();
		aq.offerFirst("affu");
		aq.add("TEju");
		aq.offerLast("happy");
		aq.offer("sanu");
		aq.addLast("Usha");
		System.out.println(aq);
		ArrayDeque<String> o=new ArrayDeque<>();
		o.add("hi");
		aq.addAll(o);
		System.out.println(aq);
		System.out.println(aq.contains(o));
		System.out.println(aq.peek());
		System.out.println(aq.pollLast());
		System.out.println(aq.pollFirst());
		System.out.println(aq);
		System.out.println(aq.size());
	}

}
