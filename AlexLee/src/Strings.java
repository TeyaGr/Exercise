import java.util.Scanner;

public class Strings {
public static void main(String[] args) {
	System.out.println("Mad lips");
	String Username = "MadPonnnyy888";
	System.out.println("My____ sister is in my _____ room !!");
String adj = "flamboyant";
String verb = "fart";
String noun = "pogo sting";
System.out.println("My" + " " + adj + " sister is in my "+ noun + " room !!");

System.out.println("He said that she was his \"friend\", but i do not buy it ");
System.out.println("\"\"");
System.out.println("ILI\\ILI");
System.out.println("What do you mean \"Stinky\"");
System.out.println("I\nwant\nevery word\nto be\non a new\nline");
System.out.println("Eeeejjjjjj kaj otidovte volku\tdaleku beeeee");


Scanner scanner = new Scanner(System.in);
System.out.println("Enter first pokemon:");

String pokemon1 = scanner.nextLine();
System.out.println(pokemon1);
System.out.println("Enter the second pokemon");
String pokemon2 = scanner.nextLine();
System.out.println(pokemon2);
System.out.println("Enter the third pokemon");
String pokemon3= scanner.nextLine();
System.out.println(pokemon3);
System.out.println("Now choose 1, 2 or 3?");
String choice = scanner.nextLine();
System.out.println("You chose pokemon number" + " " + choice);

}
}
