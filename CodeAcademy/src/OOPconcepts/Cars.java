package OOPconcepts;

public class Cars {
String type;
int numberOfDoors;
String color;
public Cars() {
	super();
	type = "Yugo";
}
public Cars(String type, int numberOfDoors, String color) {
	this.color=color;
	this.numberOfDoors=numberOfDoors;
	this.type=type;
}
public static void main(String[] args) {
	
	Cars car = new Cars("Honda",4,"Red");
	Cars car2 = new Cars();
	car2.color="Blue";
	Cars car3 = new Cars();
	
	
}
}
