import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {
public static void main(String[] args) {
	
	LinkedList<Character> list = new LinkedList <Character>();
	LinkedList<Character> reversed = new LinkedList <Character>();
	
	list.add('A');
	list.add('B');
	list.add('C');
	list.add('D');
	list.add('E');
	
	for ( Character character:list) {
		if ( character!='A'&&character!='E') {
			System.out.println(character);
			reversed.addFirst(character);
		}
		
	}
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println(reversed);
}
}
