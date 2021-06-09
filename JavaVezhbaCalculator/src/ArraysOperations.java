import java.util.Scanner;

public class ArraysOperations implements MathOptions {
	public static void mathOptions(Scanner scan, int opc) {
		System.out.println("Type of an array");
		System.out.println("1.Person");
		System.out.println("2.int");
		opc = scan.nextInt();
		if(opc==1) {
			arrayPerson(scan);
	}else if(opc==2) {
		arrayInt(scan);
	}else {
		System.out.println("Invalid");
	}
}

	private static void arrayInt(Scanner scan) {
		int [] array = {1,2,3,4,5,6,7};
		System.out.println("Choose a method");
		System.out.println("1.Lenght");
		System.out.println("2.3");
		int opc = scan.nextInt();
		if(opc==1) {
		for(int i:array) {
			i+=array.length;
			System.out.println(i);
		}
		}
		else if(opc==2) {
			if(array.length %2 ==0) {
			for(int i =0;i<array.length-1;i++) {
				if(i%2==0) {
					array[i]=array[i+1];
					System.out.println(array[i]);
				}
			}
			}else { 
				for(int i =0;i<array.length;i++) {
					if(i%2==0) {
						array[i]=array[i+1];
						System.out.println(array[i]);
					}
				}
			}
			}
				}
	

	private static void arrayPerson(Scanner scan) {
		// TODO Auto-generated method stub
		Person p1= new Person("Tea","Grombanovska",23);
		Person p2= new Person("Marija","Dimic",22);
		Person p3= new Person();
		p3.setName("Bube");
		p3.setLastname("Cvetanovska");
		p3.setAge(23);
		System.out.println("Izberi metod");
		System.out.println("1.Lica postari od 18god");
		System.out.println("2.Metod so imeto");
		int opc = scan.nextInt();
		Person[] array = new Person[3];
		array[0]=p1;
		array[1]=p2;
		array[2]=p3;
			if(opc==1) {
				for(Person person:array) {
				if(person.getAge()>=18) {
					System.out.println(person.getName()+ " "+ person.getLastname());
				}
				}
			}
				else if(opc==2) {
					for(Person person:array) {
					String persName= person.getName();
					if(persName.startsWith("A")||persName.startsWith("E")||persName.startsWith("I")||persName.startsWith("O")||persName.startsWith("U")) {
						System.out.println("Flower");
					}else if(persName.length()%2==0) {
						System.out.println("Sun");
					}else {
						System.out.println("Storm");
					}
					}
				}

		
	}
}


	
