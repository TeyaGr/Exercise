import java.util.Locale;

public class Domashno1 {

	public static void main(String[] args) {
		
		String str = "Hello stidents how is the weather today?";
		String str2 = "I will be your mentor today";
		System.out.println(str.length());
		System.out.println(str.indexOf("?"));
		System.out.println(str.substring(15));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("hello", "heyy"));
		System.out.println(str.lastIndexOf("d"));
		
		System.out.println("-----------------------");
		
		boolean isDevisible = false;
		int a = 10;
		int b = 25;
		final int DIVIDER =10;
		if (a%DIVIDER==0) {
			isDevisible = true;
			
		}
		
		System.out.println(isDevisible);
		if(b%DIVIDER==0) {
			isDevisible = true;
			
		}
			System.out.println(isDevisible);
	}
}
