import java.util.Stack;

public class CorrectnesOfBrackets {
public static void main(String[] args) {
	
	Stack<String> s = new Stack<String>();
String str = "((()) {{{)";
String [] array = str.split("");
boolean res = false;
for ( String string :array) {
	if (string.equals("(")) {
		s.push(string);
	}else if (string.equals(")")) {
		if(s.isEmpty()) {
			res = true;
			break;
			
		}
		else {
			s.pop();
			res = true;
			
		} 
			
		}else {
			continue;
	}
	if (!s.isEmpty()) {
		res = false;
	}
	
}
System.out.println(res);
}
}
