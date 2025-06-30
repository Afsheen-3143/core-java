package list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class Vlist {
public static void main(String[] args) {
	Vector V1=new Vector ();
	V1.add("affu");
	V1.add("teja");
	V1.add("renuka");
	V1.add("uma");
	System.out.println(V1);
	Vector V2=new Vector();
	V2.add("mahesh");
	V2.add("shiva");
	System.out.println(V1.addAll(0,V2));
	System.out.println(V1);
	V1.addAll(0, V2);
	System.out.println(V1);
	V1.removeAll(V2);
	System.out.println(V1);
	V1.remove(0);
	System.out.println(V1);
	System.out.println(V1.contains(V2));
	System.out.println(V1.contains("teja"));
	V1.set(1, "affu");
	System.out.println(V1.get(1));
	System.out.println(V1);
Object[]arr=V1.toArray();
System.out.println(Arrays.toString(arr));
Object[]arr1 =new Object[] {1,2,3,4};
Vector V3= new Vector(Arrays.asList(arr1));
System.out.println(Arrays.asList(arr1));
V1.capacity();
System.out.println(V1.capacity());
V1.size();
System.out.println(V1.size());
System.out.println(V1.indexOf("affu"));
System.out.println(V1.lastElement());
System.out.println(V3.firstElement());
V1.clear();
System.out.println(V1);
}}

