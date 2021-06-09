package CollecttionsTwo;

import java.util.LinkedList;

public class LinkedListChar {
public static void main(String[] args) {
	
	LinkedList <Character>  list = new LinkedList<>();
	LinkedList <Character>  list2 = new LinkedList<>();
	
	list.add('A');
	list.add('B');
	list.add('C');
	list.add('D');
	for(int i =0;i<list.size();i++) {
		if(list.get(i)!='A') {
			list2.addFirst(list.get(i));
			
		}
	}
	System.out.println(list2);
}
}
