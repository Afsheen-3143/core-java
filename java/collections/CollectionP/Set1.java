package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//remove duplicates

public class Set1 {
	public static void main(String[] args) {
////		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
////		Set<Integer> uniqueSet = new HashSet<>(list);
////		List<Integer> uniqueList = new ArrayList<>(uniqueSet);
////		System.out.println(uniqueList);  
////		
//////reverse of a list
////		Collections.reverse(uniqueList);
////		System.out.println(uniqueList);
////		System.out.println(uniqueList.contains(5));
////		System.out.println(uniqueList.isEmpty());
////		System.out.println(uniqueList.size());
////		for (Integer integer : uniqueList) {
////			System.out.println(integer);
////			
//////			linkedhashSet to maintain insertion order
////			
////			Set<Integer>s=new LinkedHashSet<>(Arrays.asList(2,5,1,6,3));
////			System.out.println(s);
////			
////			
////			
//////			Tree set for sorted order
////			Set<String> treeSet = new TreeSet<>();
////			treeSet.add("Banana");
////			treeSet.add("Apple");
////			treeSet.add("Cherry");
////
////			System.out.println(treeSet); // Output: [Apple, Banana, Cherry]
//			
//		
////		adding two sets
//			Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
//			Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
////			set1.addAll(set2);
////
////			System.out.println(set1); // Output: [1, 2, 3, 4, 5]
			
//			set1.retainAll(set2);
//			System.out.println(set1);
			
			
			        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
			        set.add("A");
			        set.add("B");
			        set.add("C");

			        System.out.println(set); // Output: [C, B, A]
			    }
			}

		


