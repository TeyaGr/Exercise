import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrder {
public static void main(String[] args) {
	
	Queue<Integer> queue = new LinkedList<Integer>();
	Stack<Integer> stack = new Stack<Integer>();
	
	queue.add(1);
	queue.add(2);
	queue.add(3);
	
	System.out.println(queue);
	
	while (!queue.isEmpty()) {
		stack.add(queue.poll());
	}
	
	System.out.println(stack);
	
	while (!stack.isEmpty()) {
		System.out.print(stack.pop() + ", ");
	}

	}
}

