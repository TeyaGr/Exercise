import java.util.LinkedList;

public class Divisible {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList <Integer>();
		LinkedList<Integer> divisible = new LinkedList <Integer>();
		LinkedList<Integer> nonDivisible = new LinkedList <Integer>();
		list.add(6);
		list.add(5);
		list.add(21);
		list.add(35);
		list.add(88);
		list.add(90);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			if(list.get(i)%3==0) {
				divisible.add(list.get(i));
			}else {
				nonDivisible.add(list.get(i));
			}
		}
		System.out.println(nonDivisible);
		System.out.println(divisible);
	}
}
