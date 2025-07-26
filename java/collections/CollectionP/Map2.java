package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public static void main(String[] args) {
		String str="success";
		Map<Character,Integer>map=new HashMap<>();
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		System.out.println(map);
	}

}
