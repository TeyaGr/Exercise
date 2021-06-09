import java.util.LinkedList;
import java.util.Stack;
public class ReversedLinkedList {
public static void main(String[] args) {
	
}
LinkedList<Integer> list= new LinkedList<Integer>();
Stack <Integer> stack = new Stack <Integer>();

list.add(1);
list.add(2);
list.add(3);
for (Integer integer: list) {
	//upush gi stava vo stack
	stack.push(integer);
}
System.out.println ( "Normal order = " + list);
	String s = "";
	while (!=stack.isEmpty()) {
		// pop gi vadi od stack
		s+=String.copyValueOf(stack.pop());
	}
}
System.out.println("Reverse order ="+ list);

}
}
