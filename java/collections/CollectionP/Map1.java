package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
//		List<String>words= Arrays.asList("abc","bca","cab","xyz","yxz","zxy","ab","ba");
//		Map<String,List<String>>map=new HashMap<>();
//		
//		for(String w:words) {
//			char[]chars=w.toCharArray();
//			String key=new String(chars);
//			map.computeIfAbsent(key, k->new ArrayList()).add(w);
//		}
//		int groupno = 1;
//		for(List<String> group:map.values()) {
//			System.out.println("groups"+group+":"+groupno);
//			groupno++;
//		}
//	}
//
//}



        List<String> words = Arrays.asList("abc", "bca", "cab", "xyz", "zyx", "zxy", "ab", "ba");

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Convert word to char array, sort it, and form a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Group words by key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Print the groups
        int groupNumber = 1;
        for (List<String> group : map.values()) {
            System.out.println("Group " + groupNumber + ": " + group);
            groupNumber++;
        }
    }
}