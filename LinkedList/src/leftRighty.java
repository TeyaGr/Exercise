import java.util.LinkedList;

public class leftRighty {
public static void main(String[] args) {
	
	LinkedList<Integer> list = new LinkedList <Integer>();
	LinkedList<Integer> reversed = new LinkedList <Integer>();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	
	for (int i =0;i<list.size();i++) {
		if(list.get(i)%2==0) {
			reversed.addFirst(list.get(i));
		}else {
			reversed.addLast(list.get(i));
		}
	}
	System.out.println(reversed)	;
}
}
