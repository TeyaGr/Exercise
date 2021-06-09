import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	
	Stack <Integer> s = new Stack <Integer>();
	s.add(5);
	s.add(10);
	s.add(15);
	s.add(111);
	s.add(333);
	System.out.println(s);
	
	System.out.println("The last element of the stack is " + " " +s.pop());
	System.out.println("Now the stack looks like this" + " " + s);
	System.out.println("Now the last element of the stack is " + " " + s.peek());
	System.out.println(s.contains(6));
	System.out.println("And the first element of the stack is " + " " +s.firstElement());
	System.out.println(s.empty());
	s.clear();
	System.out.println(s);
}
}
