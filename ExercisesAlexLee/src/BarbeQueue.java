import java.util.LinkedList;
import java.util.Queue;

public class BarbeQueue {
public static void main(String[] args) {
	
	Queue <String> bbqLine = new LinkedList<>();
	bbqLine.add("Jackson");
	bbqLine.add("Tyrique");
	bbqLine.add("Susan");
	System.out.println(bbqLine);
	System.out.println(bbqLine.poll());
	System.out.println(bbqLine);
	Queue<String> q= new LinkedList<>();
	q.add("a");
	q.add("b");
	q.add("c");
	q.add("d");
	System.out.println(q.size());
	System.out.println(q.contains("n"));
	bbqLine.remove("Tyrique");
	System.out.println(q.remove("b"));
	System.out.println(q.toArray()[2]);
}
}
