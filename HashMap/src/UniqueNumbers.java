import java.util.HashSet;

public class UniqueNumbers {
public static void main(String[] args) {
	
	HashSet<Integer> set = new HashSet<Integer>();
int [] array = {1,2,3,4,5,6,6,6,6,6,67,7,7,8,9,0};

for (int i :array) {
	set.add(i);

}
System.out.println(set);
}
}
