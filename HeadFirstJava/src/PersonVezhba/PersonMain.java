package PersonVezhba;

public class PersonMain {
public static void main(String[] args) {
	Proffesion programmer = new Proffesion("Junior developer", 1);
	Proffesion programmer2 = new Proffesion("Senior developer", 10);
	Proffesion doctor = new Proffesion("Praktikant", 3);
	Proffesion doctor2 = new Proffesion("Hirurg", 30);
	Person p1 = new Person("Tea","Grombanovska",23,programmer);
	Person p2 = new Person("Eli","Stojanova",27,programmer2);
	Person p3 = new Person("Petra","Temelkova",23,doctor);
	Person p4 = new Person("Zhan","Mitrev",60,doctor2);
	
	System.out.println(p1.getClass());
	System.out.println();
}
}
