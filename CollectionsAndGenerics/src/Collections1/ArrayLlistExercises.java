package Collections1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLlistExercises {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(2);
		list.add(77);
		list.add(4);
		list.add(190);
		reverseElement();
		sort();
		copyList(list);
	}
	static void reverseElement() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("green");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
	static void sort() {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List:"+" "+ list);
		Collections.sort(list, Collections.reverseOrder());;
		System.out.println("Reversed list"+" " + list);
	}
	static void copyList(ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Collections.copy(list, list2);
		System.out.println(list2);
		
	}
}
