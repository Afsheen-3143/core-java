package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//sort by length
public class Lambda6 {
	public static void main(String[] args) {
//		List<String>l=(Arrays.asList("banana","fig","apple"));
//		l.sort((p1,p2)->Integer.compare(p1.length(),p2.length()));
//		System.out.println(l);
	
		
//		print startwithletter
	        List<String> list = Arrays.asList("Apple", "Banana", "Orange","Avagardo");
	        Predicate<String>p=s->s.startsWith("A");
	        for (String string : list) {
	        	if(p.test(string))
	        	System.out.println(string);
				
			}

//	        list.sort((a, b) -> a.compareTo(b));;
//
//	        System.out.println(list);
	    }
	}

//	sorting according to age
//		String name;
//		int age;
//		Lambda6(String name,
//		int age){
//			this.age=age;
//			this.name=name;
//			
//		}
//		// toString method for proper printing
//	    @Override
//	    public String toString() {
//	        return name + " (" + age + ")";
//	    }
//
//		
//
//public static void main(String[] args) {
//	
//	List<Lambda6>people=Arrays.asList(
//			new Lambda6("affu",21),
//			new Lambda6("teja",22),
//			new Lambda6("renuka",20));
//	
//	people.sort((p1, p2) -> p1.age - p2.age);
//	System.out.println(people);
//
//}
//}
