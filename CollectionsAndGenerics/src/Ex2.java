
public class Ex2 {
public static void main(String[] args) {
	
	Integer [] irrey = {10,20,30,40,50};
	String [] sirrey = {"Hello", "Barbie", "Let's", "Go", "Party"};
	Double [] d = {7.5,8.5,2.3,5.5};
	getValue(irrey);
	getValue(d);
	getValue(sirrey);
}

public static <T> void getValue(T[] x) {
	for(T t :x) {
		System.out.println(t + " ");
	}
	
}
}
