package StackAndQueue;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLlist {
public static void main(String[] args) {
	
	LinkedList<Integer> l = new LinkedList<>();
	LinkedList<Integer> rl = new LinkedList<>();
	Stack<Integer> s = new Stack<>();
	l.add(55);
	l.add(88);
	l.add(770);
	for(Integer i:l) {
		s.push(i);
	}
	String rev = " ";
	while(!s.isEmpty()) {
		
		rev+=String.valueOf(s.pop());
	}
	System.out.println(rl);
	System.out.println(rev);
}
}
