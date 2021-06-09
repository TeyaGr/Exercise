package PrimitivesAndReferences;

public class Dog {

	public static void main(String[] args) {
		
		Dog[] pets;
		pets = new Dog[7];
		pets[0]= new Dog();
		pets[1]= new Dog();
		pets[2]= new Dog();
		pets[1].bark();
		pets[2].name("Luna");
		pets[0].name("Bebu");
		pets[1].name("Mimi");
	
		
	}
	public static void bark() {
		System.out.println(" Woof Woof");
	

	}
	public static void name(String s) {
		System.out.println("This pets name is"+ " "+ s);
	}
	}

