import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RwvOrder {
public static void main(String[] args) {
	
	char[] c = {'a','b','c','d'};
	Stack <Character> help = new Stack<>();
	Queue<Character> q = new LinkedList<>();
	
	for(Character ch:c) {
		help.add(ch);
		
	}System.out.println(help);
	while(!help.isEmpty()) {
	q.add(help.pop());
	
}System.out.println(q);
}
}
