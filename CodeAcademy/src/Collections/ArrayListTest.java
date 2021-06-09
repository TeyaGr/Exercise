package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	static void printEvenIndex ( ) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i =0;i<list.size();i++){
		if(i%2==0) {
			System.out.println(list.get(i));
		}
	}
	}
	static void printEvenNum ( ) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i =0;i<list.size();i++){
		if(list.get(i)%2==0) {
			System.out.println(list.get(i));
		}
	}
	}
	static void removeElement(int index) {
		ArrayList<String> list = new ArrayList();
		list.add("Pink");
		list.add("Blue");
		list.add("Purple");
		System.out.println("Before:"+" "+list);
		list.remove(index);
		System.out.println(list);
		list.set(index, "Black");
	}
	static void printList() {
	ArrayList<String> list = new ArrayList();
	list.add("Pink");
	list.add("Blue");
	list.add("Purple");
	
	System.out.println("Colors"+ " "+ list);
	for(String s : list) {
		System.out.println("Color"+ " "+ s);
	}
	
	}
	static void returnElonIndex(int i) {
		ArrayList<String> list = new ArrayList();
		list.add("Pink");
		list.add("Blue");
		list.add("Purple");
		if (i<list.size()) {
			System.out.println(list.get(i));
		}else {
			System.out.println("this list does not have an element on that index");
		}
		
	}
	
public static void main(String[] args) {
	printList();
	returnElonIndex(4);
	removeElement(1);
	ArrayList<String> list = new ArrayList();
	list.add("Pink");
	list.add("Blue");
	list.add("Purple");
	System.out.println(list.contains("white"));
Collections.sort(list);
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
ArrayList<String> list2 = new ArrayList();
list2.add("babyblue");
list2.add("ah");
list2.add("kauksh");
Collections.copy(list2,list);
System.out.println(list2);
Collections.reverse(list2);
list.addAll(list2);
System.out.println(list);
printEvenNum();
}
}
