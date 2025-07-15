package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEach {
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(1,2,3,4);
		Set<Integer>q=new HashSet<>(list);
		list.forEach(i->System.out.println(i));
		q.forEach(i->System.out.println(i));
		Map<String,Integer>M=new HashMap<>();
		M.put("hello", 101);
		M.put("Good", 102);
		M.put("morning", 103);
		M.forEach((key,value)->System.out.println(key+">>>"+value));
	}

}
