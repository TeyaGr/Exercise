package OOPconcepts;

public class Person {
private String name;
private String profession;
private int age;

public Person() {
	
}
public Person ( String name, String profession, int age) {
	this.age = age;
	this.name=name;
	this.profession=profession;
}
public Person (int age) {
	this.age=age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProfession() {
	return profession;
}
public void setProfession(String profession) {
	this.profession = profession;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static void persAge(int age) {
	System.out.println("Age:"+" "+age);
}
public static void main(String[] args) {
	Person p1 = new Person (19);
	p1.persAge(19);
	
}

}
