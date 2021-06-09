import java.util.Random;

public class FortuneCookie {
	static String[] fortune = { "A beautiful, smart, and loving person will be coming into your life.",
	"A dubious friend may be an enemy in camouflage.",
"	A faithful friend is a strong defense.",
	"A feather in the hand is better than a bird in the air. ( ...",
	"A fresh start will put you on your way.",
	"A friend asks only for your time not your money."};
public static void main(String[] args) {
Random rand = new Random();
int r = rand.nextInt(fortune.length);
	
	System.out.println(fortune[r]);
}
}
