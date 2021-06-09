import java.util.LinkedList;
import java.util.Queue;

public class First {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println(q.peek());
		q.add(1);
		q.add(5);
		q.add(8);
		q.add(10);
		q.add(12);

		System.out.println(q);

		q.remove(5);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.contains(55));
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println(q.isEmpty());
	}
}
