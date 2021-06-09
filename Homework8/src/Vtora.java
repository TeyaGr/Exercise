import java.util.ArrayList;
import java.util.Stack;

public class Vtora {
public static void main(String[] args) {
	
	String s = "ab/c**d+e+n*cccvf-";
	Stack <String> stack = new Stack<String>();
	String[] array = s.split("");
	String result = "";
	for (String string:array) {
		//System.out.println(string);
		if(!string.equals("a")&&!string.equals("b")&&!string.equals("c")&&!string.equals("d")&&!string.equals("e")&&!string.equals("a")&&!string.equals("n")&&!string.equals("f")&&!string.equals("v")) {
			stack.push(string);
			
		}
		
		}
		while(!stack.isEmpty()) {
			result=result + stack.pop();
	}
	System.out.println(result);
}
}
