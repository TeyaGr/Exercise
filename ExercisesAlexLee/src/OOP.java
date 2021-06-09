
public class OOP extends OOP2 {
String name;
	public static void sayHi() {
		System.out.println("Hi");
	}
	public static void sayHi(String name) {
		System.out.println("Hi babbyyyy my name is "+ name);

	}
	public static void sayGoodbye() {
		System.out.println("GoodBye");
	}
	public static void main(String[] args) {
	OOP p1 = new OOP();
	p1.sayHi();
	p1.sayHi("Tea");
	p1.sayHello("Hello");
	p1.sayGoodbye();
	System.out.println(p1.plus(3, 2));
	
	}
}
