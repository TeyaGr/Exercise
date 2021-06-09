import java.util.ArrayList;

public class PersonMainClass {
public static void main(String[] args) {
	
	Proffesion programmer = new Proffesion("Java programmer", 10);
	Proffesion juniorProgrammer = new Proffesion("Java programmer", 5);
	Proffesion midProgrammer = new Proffesion("Java programmer", 10);
	Proffesion hirurg = new Proffesion("doctor", 9);

	Proffesion doctor = new Proffesion();
	doctor.setExperience(20);
	doctor.setTitle("Doctor");
	
	//n  objekt od person
	// toj ima ime String prezime String godinni int i profesija - object od proffesion klasata
	Person p1 = new Person ( "Eli", "Stojanova", 27, programmer);
	Person p2 = new Person ( "Zan", "Mitrev", 58, doctor);
	Person p3 = new Person ( "Goran", "Kocev", 25, juniorProgrammer);
	Person p4 = new Person ( "Sashko", "Klimkarov", 28, hirurg);
	ArrayList<Person> list = new ArrayList <Person>();
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	for (Person p : list) {
		printElement(p);
		
	}
}

private static void printElement(Person p) {
System.out.println ( "Name:"+ " " + p.getName() + "LastName" + " "+ p.getLastName());
	
}
}
