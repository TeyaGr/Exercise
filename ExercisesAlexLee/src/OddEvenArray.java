import java.util.LinkedList;
import java.util.Queue;

public class OddEvenArray {
public static void main(String[] args) {
	
	int [] i = {1,2,3,4,5,6,7,8};
	Queue<Integer> odd =new LinkedList<>();
	Queue<Integer> even =new LinkedList<>();
	for(Integer integer :i) {
		if(integer%2==0) {
			even.add(integer);
		}else {
			odd.add(integer);
		}
	}
	System.out.println("The array has"+" "+ odd.size()+ " "+ "odd elements and "+ " "+ even.size() + " "+"even elements");
}
}
