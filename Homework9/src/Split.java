import java.util.LinkedList;
import java.util.Queue;

public class Split {
public static void main(String[] args) {
	
	Queue<Integer> q = new LinkedList<Integer>();
	Queue<Integer> odd = new LinkedList<Integer>();
	Queue<Integer> even = new LinkedList<Integer>();
	q.add(10);
	q.add(15);
	q.add(20);
	q.add(25);
	q.add(30);
	q.add(35);
for (Integer i:q) {
	System.out.println(i);
if(i%2==0) {
	odd.add(i);
}else {
	even.add(i);
		}
			
}
System.out.println(odd);
System.out.println(odd);
}
}
