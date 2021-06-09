package Collections1;

import java.util.ArrayList;

public class PersonMain {
public static void main(String[] args) {
	
	Proffesion programer = new Proffesion ( "Programer", 15);
	Proffesion doctor = new Proffesion ("Hirurg", 12);
	Proffesion pilot = new Proffesion ("Co-Pilot", 28);
	
	Person p1 = new Person("Tea", "Grombanovska",programer, 13);
	Person p2 = new Person("Martin", "Grombanovski", pilot, 58);
	Person p3 = new Person("Tina", "Rasic", doctor, 58);
	
	ArrayList<Person> list = new ArrayList<Person>();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	
	for ( Person p :list) {
		printElement(p);
	}
	
}

private static void printElement(Person p) {
	System.out.println("Name: " + p.getName() + " Lastname: " + p.getLastname());
	// TODO Auto-generated method stub
	
}
private static void removePerson(ArrayList<Person> list) {
	for(int i =0 ; i<list.size(); i++) {
		Person p =list.get(i);
		if ( p.getYears()<18) {
			list.remove(i);
			
		}
	}
	System.out.println(list);
}
private static void printDoctors(ArrayList<Person> list) {
	for( Person person:list) {
		if (person.getProffesion().getTitle().equals("Doctor")&& person.getProffesion().getExperience()>18);
		printElement(person);
	}
}
}
