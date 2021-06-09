import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
public static void main(String[] args) {
	
	//123 i na vadenje 123
	
	Queue<Integer> queue = new LinkedList<Integer>();
	queue.add(1);
	queue.add(2);
	queue.add(3);
	
	while(!queue.isEmpty()) {
		System.out.println(queue.poll());
	}
}
}
