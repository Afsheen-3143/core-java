package Collection;

import java.util.*;

class Customer implements Comparable<Customer> {
	String name;
	int priority;
	Customer(String name,
	int priority){
		this.name=name;
		this.priority=priority;
		
	}

	@Override
	public int compareTo(Customer other) {
		
		return Integer.compare(this.priority, other.priority);
		
	}

}
public class Queue1 {
    public static void main(String[] args) {
        PriorityQueue<Customer> queue = new PriorityQueue<>();
        queue.add(new Customer("Regular Joe", 3));
        queue.add(new Customer("VIP Mike", 1));
        queue.add(new Customer("Premium Alice", 2));
        
        while(!queue.isEmpty()) {
        	Customer c=queue.poll();
        	System.out.println("Serving: " + c.name + " (Priority: " + c.priority + ")");
        }
    }}