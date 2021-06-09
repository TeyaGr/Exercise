import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrder {
public static void main(String[] args) {
	
	Queue<Integer> q = new LinkedList<Integer>();

	Stack<Integer> s = new Stack<Integer>();
	
	s.add(1);

	s.add(5);

	s.add(8);

	s.add(10);
	System.out.println("The  number list is :"+ " " + s+ " ");

	while(!s.isEmpty()) {
		q.add(s.pop());
	}
	System.out.println("The reverse number list is :"+ " " + q+ " ");
}
}
