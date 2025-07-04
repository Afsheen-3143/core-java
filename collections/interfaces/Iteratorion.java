package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Iteratorion {
	public static void main(String[] args) {
//		it is applicable for every legacy classes(v.0), new classes(v.1)
//		remove method can be used in this
//		List<Integer> l=new ArrayList<>();
//		l.add(23);
//		l.add(90);
//		l.add(78);
//		l.add(32);
//		Iterator<Integer> I=l.iterator();
//		while(I.hasNext()) {
//			System.out.println(I.next());
//			set
			TreeSet<Integer> s=new TreeSet<>();
			s.add(23);
			s.add(45);
			s.add(56);
			s.add(32);
			s.addAll(s);
			Iterator<Integer> I=s.iterator();
			while(I.hasNext()) {
				System.out.println(I.next());
				I.remove();
		}
	}

}
