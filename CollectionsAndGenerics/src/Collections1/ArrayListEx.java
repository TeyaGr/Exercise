package Collections1;

import java.util.ArrayList;

public class ArrayListEx {
public static void main(String[] args) {
	
	ArrayList<Integer> i = new ArrayList();
	i.add(1);
	i.add(5);
	i.add(10);
	System.out.println(i);
	System.out.println(i.contains(5));
	i.set(2, 23);
	System.out.println(i);
	System.out.println(i.get(1));
	ArrayList<String> s = new ArrayList();
	s.add("Bebi");
	s.add("Beb");
	s.add("Be");
	System.out.println(s);
}
}
