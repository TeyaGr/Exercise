import java.util.LinkedList;
import java.util.Queue;

public class Main {
public static void main(String[] args) {
	
	Person p1 = new Person ("Teodora", "Grombanovska");
	Person p2 = new Person ("Sofija", "Hristovska");
	Person p3 = new Person ("Angela", "Fisher");
	Person p4 = new Person ("Ina", "Kostovska");
	Person p5 = new Person ("Bube", "Cvetanovska");
	Person p6 = new Person ("Florina", "Djingova");
	
	Queue<Person> q = new LinkedList<Person>();
	q.add(p1);
	q.add(p2);
	q.add(p3);
	q.add(p4);
	q.add(p5);
	q.add(p6);
	System.out.println(q);
}
}
