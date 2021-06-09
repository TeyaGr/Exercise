import java.util.Iterator;
import java.util.LinkedList;

public class OddEven {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList <Integer>();
		LinkedList<Integer> odd = new LinkedList <Integer>();
		LinkedList<Integer> even = new LinkedList <Integer>();
		list.add(7);
		list.add(5);
		list.add(22);
		list.add(35);
		list.add(88);
		list.add(74);
		
		for (Iterator i = list.listIterator(); i.hasNext();) {
			System.out.println(i.next());
		}
		for (int i =0;i<list.size();i++) {
			if(list.get(i)%2==0) {
			even.add(list.get(i));
		}else{
		 
			odd.add(list.get(i));
		}
		
	}System.out.println(odd);
		System.out.println(even);
		
		Iterator i = list.listIterator();
		
}
}
