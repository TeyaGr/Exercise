import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinked {
public static void main(String[] args) {
	
	LinkedList<Integer> hm = new LinkedList<>();
	LinkedList<Integer>mh = new LinkedList<>();
	Stack<Integer> s = new Stack<>();
	hm.add(1);
	hm.add(2);
	hm.add(3);
	System.out.println(hm);
	for(Integer i :hm) {
		s.push(i);
		mh.addFirst(s.pop());
		
	}
	System.out.println(mh);
}
}
