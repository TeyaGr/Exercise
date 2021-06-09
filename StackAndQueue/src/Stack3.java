
import java.util.Stack;
public class Stack3 {
public static void main(String[] args) {
	
	// Da proveri stackot da li se korektno otvoreno zatvoreni zagradite
	// (()) - korekten, (()()) - korekten
	// (()())) - nekorekten nema soodvetno zatvorena
	
	Stack<String> stack = new Stack <String>();
	String s = "(()())";
	String[] array = s.split("");
	boolean flag = false;
	for ( String string : array) {
		if ( string.equals("(")) {
			stack.push(string);
		}
	else {
		if(stack.isEmpty());{
		flag = false;
	}
		else 
	{
		stack.pop()
	}
};

}
