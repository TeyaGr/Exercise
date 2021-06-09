import java.util.HashSet;

public class Digits {
public static void main(String[] args) {
	
	HashSet <Integer> set = new HashSet<Integer>();
int[] array = {1,2,3,3,3,3,5,6,6,6,6,};
for (Integer i:array) {
	set.add(i);
}
System.out.println(set);
}
}
