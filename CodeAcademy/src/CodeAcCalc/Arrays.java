package CodeAcCalc;

import java.util.Scanner;

public class Arrays implements InputOptions {

	@Override
	public void inputOp(Scanner scan, int choice) {
		System.out.println("Choose an array option");
		System.out.println("1.Person");
		System.out.println("2.Int");
		choice = scan.nextInt();
		if(choice==1) {
			personArray(scan);
		}else if(choice == 2) {
			intArray(scan);
		}else {
			System.out.println("Please choose a valid array");
		}
		
	}
private void personArray(Scanner scan) {
	System.out.println("Make a choice");
	System.out.println("1.Print people older than 18");
	System.out.println("2.Name method");
	int choice = scan.nextInt();
	Person p1 = new Person("Tea", 23);
	Person p2 = new Person("Martin",17);
	Person p3 = new Person("Stefan",26);
	Person[] list = {p1,p2,p3};
	if(choice ==1) {
		for(Person person:list) {
			if(person.getAge()>18) {
				System.out.println(person);
			}
		}
	
		if(choice==2) {
			for(Person person:list) {
			if(person.getName().startsWith("a") || person.getName().startsWith("e") || person.getName().startsWith("u")
					|| person.getName().startsWith("o")) {
				System.out.println("Flower");
			}else if(person.getName().length()%2==0) {
				System.out.println("Storm");
			}else {
				System.out.println("Sun");
			}
		}
	}
	
}
	
}
private void intArray(Scanner scan) {
	int[] list = {1,2,3,4,5,6};
	System.out.println("Choose an option");
	System.out.println("1.increase every element");
	System.out.println("2.even index");
	int choice = scan.nextInt();
	
		if(choice==1) {
			int length = list.length;
			for(int i :list) {
			i+=length;
			System.out.println(i);
		}
	}
		if(choice==2) {
			for(int i=0;i<list.length;i++) {
				if(i%2==0) {
					list[i]+=list[i+1];
					System.out.println(list[i]);
				}
				
			}
		}
}
}
