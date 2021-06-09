import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
public static void main(String[] args) {
	
	String s = "KAJAK";
	Queue <String> q = new LinkedList <String>();
	Stack <String> st = new Stack <String>();
	String[] str =s.split("");
	String reverse = "";
	for(String string : str) {
		System.out.println(string);
		q.add(string);
	}
	while(!q.isEmpty()) {
		st.push(q.poll());
	}
	while(!st.isEmpty()) {
		reverse+=st.pop();
	}
	System.out.println(reverse.equals(s));
}
}
