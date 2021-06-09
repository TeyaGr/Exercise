package StackAndQueue;

import java.util.Stack;

public class PostFixNotation {
public static void main(String[] args) {
	Stack<String> s = new Stack<>();

	String p = "59+2*65";
	String[] array = p.split("");
		
	
	for(String str:array) {
		if(str.equals("+")&&str.equals("*")){
			int first = Integer.parseInt(s.pop());
			int second = Integer.parseInt(s.pop());
			switch(str) {
			case "+":
				s.push(String.valueOf(second+first));
				break;
			case "-":
				s.push(String.valueOf(second-first));
				break;
			}
		}else {
			s.push(str);
		}
	}
System.out.println(s.peek());
}
}
