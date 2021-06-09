package StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String p = "madamm";
		ArrayList <String>l = new ArrayList<>();
		ArrayList <String>l2 = new ArrayList<>();
		Stack<String> s = new Stack<>();
		boolean ch = false;
		String [] a = p.split("");
		for(String str:a) {
			l.add(str);
			s.push(str);
		}
		System.out.println(l);
		while(!s.isEmpty()) {
		l2.add(s.pop());
		}
		if(l.equals(l2)) {
			ch=true;
		
		}else {
			ch=false;
		}
		System.out.println(ch);
	}
}
