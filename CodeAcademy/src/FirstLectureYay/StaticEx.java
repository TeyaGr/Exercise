package FirstLectureYay;

public class StaticEx {

	String name;
	static String college = "UKIM";

	StaticEx(String name) {
		this.name = name;

	}

	void display() {
		System.out.println(name + " " + college);
	}

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx("Tea");
		StaticEx s2 = new StaticEx("Sofi");
		StaticEx s3 = new StaticEx("Flor");
		s1.display();
		s2.display();
		s3.display();

		int i = 5;
		System.out.println(i++);
		System.out.println(i);
		int b = 10;

		System.out.println(++b);
		System.out.println(b);
		System.out.println(--b);
		String a = "Hello students! How is the weather today?" ; 
System.out.println(a.replace("Hello", "Hey"));
	}
	

	
}