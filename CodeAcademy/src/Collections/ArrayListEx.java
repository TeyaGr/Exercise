package Collections;

import java.util.ArrayList;

public class ArrayListEx {
static int calculateSum(ArrayList <Integer> list) {
	int sum = 0;
	for(Integer i : list) {
		sum+=i;
		
	}
	return sum;
}
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(11);
System.out.println(calculateSum(list));
}
}
