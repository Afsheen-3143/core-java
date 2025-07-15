package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class person implements Comparable<person>{

	private int age;
	private String name;
	public person(int age ,String name) {
		this.age=age;
		this.name=name;
		
	}
	
	@Override
	public int compareTo(person anotherperson) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, anotherperson.age);
	}
@Override
public String toString(){
	return name+" "+age+" ";
}}
public class comparable2 {
	public static void main(String[] args) {
		List<person>people=Arrays.asList(
			new person( 43,"jock"),
			new person(23,"shiva"),
			new person(33,"raju"));
		Collections.sort(people);
		System.out.println(people);
		}
	}


