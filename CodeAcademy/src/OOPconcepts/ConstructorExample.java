package OOPconcepts;

public class ConstructorExample {
String s;
int i;
int j;
public ConstructorExample(String s, int i, int j) {
	super();
	this.s = s;
	this.i = i;
	this.j = j;
	
}
public static void main(String[] args) {
	ConstructorExample ce1= new ConstructorExample("Hello babbyy", 2, 3);
	System.out.println(ce1.i+ce1.j+ce1.s);
}
}
