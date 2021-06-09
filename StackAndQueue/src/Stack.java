
public class Stack {
public static void main(String[] args) {
	
	// create stack
	
	Stack <Integer> stack = new Stack<Integer>();
	// add element
	stack.add(5);
	stack.add(6);
	
	// see the last element but dont remove it from the stack
	System.out.println(stack.peek());
	
	//get the last element
	System.out.println(stack.pop());
	
	// is the stack empty
	System.out.println(stack.isEmpty());
}
}
