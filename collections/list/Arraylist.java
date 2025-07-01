package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist {
public static void main(String[] args) {
	Integer[]arr=new Integer[] {4,5,2,9};
	ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(arr));
	al1.add(3);
	al1.add(19);
	al1.add(3,67);
	System.out.println(al1);
	al1.remove(0);
	al1.addAll(al1);
	System.out.println(al1);
	System.out.println(al1.size());//doesnot allow capcity
	for(int i=0;i<al1.size();i++) {
		System.out.print(al1.get(i)+ " ");
	}
	Collections.synchronizedList(al1);  // allow multiple threads
}
}
