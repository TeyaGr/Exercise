
public class Arrays {
public static void main(String[] args) {
	
	String[] wordList1 = {"paper" , "snow", "aghost", "luna", "doggo"};
	String[] wordList2 = {"bravo", "da", "ne", "terasa", "klucevi", "pinkpong"};
	String[] wordList3  = {"lotr", "mi", "e", "omilena", "triloija", "wohoo"};
	int onelenght = wordList1.length;
	int twoLenght = wordList2.length;
	int three = wordList3.length;
	System.out.println(onelenght);
	System.out.println(twoLenght);
	System.out.println(three);
	
	int rand1 =(int) ( Math.random() * onelenght);
	int rand2=(int) ( Math.random() * twoLenght);
	
	int rand3 = (int) ( Math.random() * three);
	
	String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
	System.out.println(phrase);
	
}
}
