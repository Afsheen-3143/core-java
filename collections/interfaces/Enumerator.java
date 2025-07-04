package lists;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Enumerator {

	public static void main(String[] args) {
//		It support v.0 version
//		it only applicable for HasTable,Stack,Vector,Dictionary,Property
		
//Vector V=new Vector();
//V.add(3);
//V.add(5);
//V.add(78);
//V.add(89);
//Enumeration<Integer>e=V.elements();
//while(e.hasMoreElements()) {
//	System.out.println(e.nextElement());
//	
//	Stack implementation
//	Stack S=new Stack();
//	S.add(3);
//	S.add(5);
//	S.add(78);
//	S.add(89);
//	Enumeration<Integer>e=S.elements();
//	while(e.hasMoreElements()) {
//		System.out.println(e.nextElement());
//		HashTables implementation
//		Map<Integer,String>  m= new Hashtable<>(); 
//		m.put(1000, "rice");
//		m.put(100, "sugar");
//		m.put(50, "salt");
//		m.put(100, "Redchilli");
//		Enumeration<String>e=((Hashtable<Integer,String>) m).elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//			properties
			Properties p=new Properties();
			p.setProperty("affu", "chandur");
			p.setProperty("teja", "Nalgonda");
			p.setProperty("renuka", "sagar");
			Enumeration<Object>e=p.elements();
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
		
}
//			p.elements().asIterator();
	}

}
