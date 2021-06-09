package Car;

public class Car {
public static void main(String[] args) {
	
	CarFactory car1 = new CarFactory ( "Blue", "Mazda");
	CarFactory car2 = new CarFactory ( "Red", "Honda");
	
	car1.properties();
	car2.properties();
}
}
