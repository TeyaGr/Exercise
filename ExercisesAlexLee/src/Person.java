
public class Person extends GettersAndSetters {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2= new Person();

		Person p3 = new Person();

		Person p4 = new Person();
p1.age = 12;
p1.name = "Linda";

p1.ocupation = "Doctor?";

p2.setName("Monika");
p2.setAge(15);
p2.setOcupation("TruckDrver");
p2.printDetails("Marija", "Doctor", 55);
System.out.println(p2);
	}
}
