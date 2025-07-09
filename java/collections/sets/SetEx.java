package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetEx {
	public static void main(String[] args) {
		//use LinkedlistSet,HashSet as new classes
		TreeSet<Integer> s=new TreeSet<>();
		s.add(23);
		s.add(45);
		s.add(56);
		s.add(32);
		s.addAll(s);
		
		System.out.println(s);
		
		s.equals(s);
		System.out.println(s);
		System.out.println(s.contains(32));
		for (Integer integer : s) {
			System.out.println(integer);
			
			
		}
			System.out.println(s.size());
			//this methods can be used in TreeMap
			System.out.println(s.first());
			System.out.println(s.last());
			System.out.println(s.pollFirst());
			System.out.println(s.pollLast());
			System.out.println(s.descendingSet());
			System.out.println(s.subSet(20, 100));
			
		}
	}


