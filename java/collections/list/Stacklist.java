package list;

import java.util.Stack;

public class Stacklist {
	public static void main(String[] args) {
		Stack<String>  S=new Stack<>();
		S.push("red");
		S.push("white");
		S.push("orange");
		System.out.println(S);
		System.out.println(S.peek());
		System.out.println(S.search("red"));
		System.out.println(S.pop());
		System.out.println(S.empty());
		System.out.println(S);
	}

}
