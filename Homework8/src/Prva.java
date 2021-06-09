
import java.util.ArrayList;
import java.util.Stack;

public class Prva {
public static void main(String[] args) {
	ArrayList <Integer> numbers = new ArrayList<Integer>();
	Stack<Integer> stack = new Stack<Integer>();
	int sum = 0;
	for ( int i =1;i<5;i++) {
		if(i%2==0) {
			stack.push(i);
			numbers.add(i);
		}
		while(!stack.isEmpty()) {
			sum+=stack.pop();
		}
	}
	System.out.println(numbers + " " + sum);
	
}
}
