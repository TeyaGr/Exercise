package OOPconcepts;

public class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("Meow meow meow");
		
	}
	public static void main(String[] args) {
	Cat kitty = new Cat();
	kitty.sound();
	
	}
	
}
