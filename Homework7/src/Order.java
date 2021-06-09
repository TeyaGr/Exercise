import java.util.LinkedList;

public class Order {
public static void main(String[] args) {
	
	LinkedList<Character> list = new LinkedList <Character>();
	LinkedList<Character> newList = new LinkedList <Character>();
	
	list.add('Y');
	list.add('A');
	list.add('E');
	list.add('O');
	list.add('H');
	list.add('G');
	
	for ( Character character:list) {
		if(character!='A'&&character!='O'&&character!='G') {
			newList.addFirst(character);
		}
	}
	System.out.println(newList);
}
}
