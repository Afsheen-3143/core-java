package queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue {
public static void main(String[] args) {
	PriorityQueue<Integer>q=new PriorityQueue<>(Comparator.reverseOrder());
	q.offer(23);
	q.add(12);
	q.add(56);
	q.offer(43);
	
	System.out.println(q);
//	q.comparator();
//	System.out.println(q);
	System.out.println(q.contains(23));
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q.containsAll(q));
	System.out.println(q.remove(43));//it removes head value
	System.out.println(q);
	while(!q.isEmpty()) {
		System.out.println(q.remove());
		q.clear();
		System.out.println(q);
	}
	
}
}
