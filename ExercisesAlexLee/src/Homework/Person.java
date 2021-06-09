package Homework;

public class Person {

	private String name;
	private String profession;
	private int years;
	Person (String name, String profession, int years){
		this.name = name;
		this.profession = profession;
		this.years = years;
		System.out.println(name + profession + years);
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
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	public  void getYears ( int years) {
		this.years = years;
		System.out.println(years);
	}
	void getName(String name) {
		this.name = name;
		System.out.println(name);
	}
}
