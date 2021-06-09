package CollecttionsTwo;

import java.util.Iterator;
import java.util.LinkedList;

public class OddeVenNumbers {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		LinkedList<Integer> odd = new LinkedList<>();
		LinkedList<Integer> even =  new LinkedList<>();
		LinkedList <Character>  list = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		Iterator i = l.iterator();
		int counter = 0;
		while(i.hasNext()&& counter<l.size()) {
			if(l.get(counter)%2==0) {
				even.add(l.get(counter));
			
			}else {
				odd.add(l.get(counter));
			}
			counter++;
		}
		System.out.println(odd);
		System.out.println(even);
	}
}
