import java.util.Stack;

public class Brackets {
	public static void main(String[] args) {
		// (()) (()()))
		// za sekoja ( mora da ima )
		// ne moze da pochnuva izrazot so )
		// kako ke se polni stekot:
		// site ( zagradi odat vo stek
		//site ) proveruvam dali stekot e prazen 
		// ako ne e, vadime 1 zagrada od stekot i so toa sme oformile par
		// do toj moment imame korekten izraz
		Stack<String> stack = new Stack<String>();
		
		String s = "())";
		//split -  go deli stringot spored nashiot delimetar
		//delimetar moze da bide sekakov karakter
		String[] array = s.split("");
		
		//flag ni go sledi rezultatot
		boolean flag = false;
		
		for (String string : array) {
			if (string.equals("(")) {
				// ( vnesuvam vo stack
				stack.push(string);
			} else if (string.equals(")")){
				//ako e )
				
				
				if (stack.isEmpty()) {
					flag = false;
				break;
				} else {
					//vadime ( zagrada od stek
					stack.pop();
					//setirame flag = true, t.e sega za sega e okej izrazot
					flag=true;
					
				}
				continue;
			}
	
		if(!stack.isEmpty()) {
			flag = false;
		}
		}
		
		System.out.println(flag);
	}
}

