package ArrayListObject;

import java.util.ArrayList;

public class PersonMain {
public static void main(String[] args) {
	
	ArrayList <Person> list = new ArrayList<>();
	
	Proffesion programmer = new Proffesion("Programmer", 11);
	Proffesion programmer2 = new Proffesion(" Junior Programmer", 3);
	Proffesion cobbler = new Proffesion();
	Proffesion doctor = new Proffesion();
	Proffesion doctor2 = new Proffesion("Hirurg",18);
	Proffesion doctor3= new Proffesion("Sestra",3);
	doctor.setTitle("Sestra");
	doctor.setExp(15);
	
	Person p1 = new Person("Tea","Grombanovska",24, programmer);
	Person p2 = new Person("Petra","Temelkova",23,doctor2);
	Person p3 = new Person("Bube","Cvetanovska",23,doctor);
	Person p4 = new Person("Florina","Djingova",23,programmer2);
	Person p5 = new Person("Brankiva","Bogdanovic",22,doctor3);
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	list.add(p5);
	
	for ( Person p:list) {
		System.out.println(p.getName()+ " "+ p.getLastname());
	
		}
	for(int i = 0;i<list.size();i++) {
		Person p = list.get(i);
		if(p.getAge()<18) {
			list.remove(i);
			
		}
		if(p.getProffesion().getTitle()=="doctor"&& p.getProffesion().getTitle()=="doctor3"&& p.getProffesion().getTitle()=="doctor2" && p.getProffesion().getExp()<18) {
			System.out.println(p);
		}
	}

		}
	
	}
 


