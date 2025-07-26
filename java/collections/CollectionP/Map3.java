package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) {
		Map<String,Integer>m=new HashMap<>();
		String[] logins = {"user1", "user2", "user1", "user3", "user1"};
		for(String s:logins) {
			m.put(s, m.getOrDefault(s, 0)+1);
			
		}
		System.out.println(m);


	}

}
