import java.util.Iterator;
import java.util.Stack;

public class StackYei {
public static void main(String[] args) {
	
	Stack<Integer> st = new Stack<>();
	st.push(3);
	st.push(5);
	st.push(2);
	st.push(1);
	
	System.out.println(st);
	for(Integer i :st) {
		System.out.println(i);
	}
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	System.out.println(st);
}
}
