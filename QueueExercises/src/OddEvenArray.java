import java.util.LinkedList;
import java.util.Queue;

public class OddEvenArray {
public static void main(String[] args) {
	
	int[] array = {1,2,3,4,5,6,7,8,9,10};
	Queue<Integer> odd = new LinkedList<Integer>();
	Queue<Integer> even = new LinkedList<Integer>();
	for(Integer i :array) {
		System.out.println(i);
		if(i%2==0) {
			even.add(i);
			
		}else {
			odd.add(i);
		}
	}
	System.out.println("There are"+ " "+ even.size()+ " " + "even numbers in the array");
	System.out.println("There are"+ " "+ odd.size()+ " " + "odd numbers in the array");
}
}
