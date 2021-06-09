package OOPconcepts;

public class Dog extends Animals implements AnimalInterface, HumanInterface{
private String name;
static Cars car;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Dog(String name, Cars car) {
	super();
	this.name = name;
	this.car= car;
}
void bark() {
	System.out.println("Woof Woof");
}
public static void main(String[] args) {
	
	Dog luna = new Dog("Luna", car);
	Cars car = new Cars("Spark",5,"White");
	System.out.println();
	luna.bark();
	luna.eat();
	luna.eating();
	luna.working();
	
}

@Override
public void sound() {
	// TODO Auto-generated method stub
	
}

@Override
public void sleep() {
	// TODO Auto-generated method stub
	
}

@Override
public void working() {
	System.out.println("The human is working");
	
}

@Override
public void eating() {
	System.out.println("The peron is eating");
	
}
}
