import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		
		//Boolean mozhe da e samo true ili false
		
		boolean a = false;
		int b = 5;
		boolean c = b>5;
		System.out.println(c);
		int t = 100;
		boolean d = t==b;
		System.out.println(d);
		// Doors
		boolean passed = true;
		boolean skipped = false;
		int doorCount = 0;
		boolean AllDoors=false;
		if(passed) {
			System.out.println("We passed the first door");
			doorCount++;
		}
		if(skipped) {
			System.out.println("We passed the second door");
			doorCount++;
		
	}
		if(passed) {
			System.out.println("We passed the third door");
			doorCount++;
}
		if(doorCount==3) {
			AllDoors = true;
		}
		
			if(AllDoors){			
				System.out.println("Congrats you won");
	}else {
		System.out.println("Sorry you lost ");
	}
		
	}
}
	
