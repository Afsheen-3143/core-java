package String;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator2 {
	public static void main(String[] args) {
		Comparator<String>bylength=(String s1, String s2)->(s1.length()-s2.length());
	String []name={"bobby","rama","affu","anshu"};
				Arrays.sort(name, bylength);
				System.out.println(Arrays.toString(name));
			}
			
		
	}


