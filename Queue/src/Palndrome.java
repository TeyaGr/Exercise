import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palndrome {
public static void main(String[] args) {

		
			Queue<String> queue = new LinkedList<String>();
			Stack<String> stack = new Stack<String>();
			//queue.add("q");
			queue.add("u");
			queue.add("e");
			queue.add("u");
			//queue.add("e");
			String s = "";
			String reverse = "";
			while (!queue.isEmpty()) {
				s += queue.peek();
				stack.add(queue.poll());
			}
	        while (!stack.isEmpty()) {
	        	reverse += stack.pop();
			}
	       System.out.println(s.equals(reverse));
		}
	}
