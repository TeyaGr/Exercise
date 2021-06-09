import java.util.ArrayList;
import java.util.Collections;

public class MyClass {

	public static void main(String[] args) {
		
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("Spark");
		cars.add("Ferrari");
		System.out.println(cars);
		
		String [] dogs = {"Husky", "Samoyed", "MyDogLuna", "Chihuawaha"};
		ArrayList<String> dog = new ArrayList<String>();
		for ( String a :dogs) {
			System.out.println(a);
		}
		String [] cats = {"Zaza", "Beba", "Spiro"};
		String [] horses = {"WhiteHorse", "BlackHorse"};
		
		cars.get(1);
		cars.set(1, "Lambo");
		Collections.sort(cars);
			
		}
	}
}
