package lists;
import java.lang.reflect.Array;
import java.util.*;
public class List4 {
public static void main(String[] args) {
//	dupicate value count
//	String [] arr= {"affu","teja","renu","affu","renu","renu"};
//	Map<String,Integer> m=new HashMap<>();
//	for (String string : arr) {
//		m.put(string, m.getOrDefault(string,0)+1);
//	}
//		for(Map.Entry<String,Integer>entry:m.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey()+" "+entry.getValue());
//			}
//		}
//	}
//}

//mostfreq

//        int[] arr = {4, 1, 9, 4, 8, 0, 5, 8, 1, 8, 6};
//        Map<Integer, Integer> countMap = new HashMap<>();
//        
//        for (int num : arr) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        int maxCount = 0;
//        int mostFrequent = -1;
//
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            if (entry.getValue() > maxCount) {
//                maxCount = entry.getValue();
//                mostFrequent = entry.getKey();
//            }
//        }
//
//        System.out.println("Most frequent element: " + mostFrequent);
//    }
//}
//removing duplicates


	        List<Integer> list = Arrays.asList(4, 1, 9, 4, 8, 0, 5, 1, 8, 6);

	        Set<Integer> uniqueSet = new LinkedHashSet<>(list); // preserves order

	        System.out.println("List after removing duplicates: " + uniqueSet);
	    }
	}

