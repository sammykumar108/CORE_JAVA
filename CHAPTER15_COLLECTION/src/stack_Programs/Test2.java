package stack_Programs;

import java.util.Stack;

public class Test2 {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("aaa");
		s.push("bbb");
		s.push("ccc");
		s.push("ddd");
		System.out.println(s.search("ccc"));
		System.out.println(s.search("zzz"));
	}
}
