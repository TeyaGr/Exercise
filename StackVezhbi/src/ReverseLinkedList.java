import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList {
public static void main(String[] args) {
	
	LinkedList<Integer> l = new LinkedList<Integer>();
	Stack<Integer> s = new Stack<Integer>();
	l.add(5);
	l.add(8);
	l.add(9);
	l.add(10);
	l.add(15);
	System.out.println(l);
	// reverse it
	for (Integer i:l) {
		// gi stava vo stack
		s.push(i);
	}
	String str = "";
	while (!s.isEmpty()) {
	str +=String.valueOf(s.pop());
	}
	System.out.println("The reversed stack is :"+ " " + str);
}
}
