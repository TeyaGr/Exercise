import java.util.LinkedList;
import java.util.Queue;

public class ParallelJoin {
public static void main(String[] args) {
	
	Queue<Integer> q = new LinkedList<Integer>();

	Queue<Integer> q2 = new LinkedList<Integer>();
	q.add(1);
	q.add(3);
	q.add(5);
	q.add(7);
	q2.add(2);
	q2.add(4);
	q2.add(6);
	q2.add(8);
	Queue<Integer> result = new LinkedList<Integer>();
	while(!q.isEmpty()) {
		result.add(q.poll());
		result.add(q2.poll());
	}
	System.out.println(result);
}
}
