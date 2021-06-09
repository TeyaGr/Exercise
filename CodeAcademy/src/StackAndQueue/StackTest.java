package StackAndQueue;

import java.util.Stack;

public class StackTest {
public static void main(String[] args) {
	
	Stack<Integer> s = new Stack<>();
	s.add(5);
	s.add(4);
	s.add(3);
	System.out.println(s);
	System.out.println(s.peek());
	s.pop();
	System.out.println(s);
	System.out.println(s.empty());
	System.out.println(s.isEmpty());
	s.clear();
	System.out.println(s);
	System.out.println(s.empty());
}
}
