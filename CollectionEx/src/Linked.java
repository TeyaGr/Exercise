import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
public static void main(String[] args) {
	
	LinkedList<Integer> li = new LinkedList<>();
	li.addFirst(1);
	li.addFirst(2);
	li.addFirst(3);
	System.out.println(li);
	for(Iterator ir = li.iterator(); ir.hasNext();) {
		System.out.println(ir.next());
	}
	LinkedList<Integer> il = new LinkedList<>();
il.addLast(1);
il.addLast(2);
il.addLast(3);
System.out.println(il);

il.remove();
System.out.println(il);

LinkedList<Integer> lir = new LinkedList<>();
for(Integer i : li) {
	lir.addFirst(i);
	System.out.println(lir);
}

System.out.println(lir.getFirst());
System.out.println(lir.getLast());
System.out.println(lir.indexOf(2));
LinkedList<Character> so = new LinkedList<>();
		so.addLast('A');
		so.addLast('B');
		so.addLast('C');
		so.addLast('D');
		so.addLast('E');
		Sort(so);
	}
public static void Sort ( LinkedList<Character> link) {
	for( Character c:link) {
	if(c!='A'&& c != 'E') {
		
	
		link.addFirst(c);
		System.out.println("Reversed" + " " +link);
	}
	}
	
}
}



