import java.util.LinkedList;
import java.util.Queue;

public class QGame {
public static void main(String[] args) {
	
	Queue<String> First = new LinkedList<>();
	Queue<String> Second = new LinkedList<>();
	int TotalRed1=0;
	int TotalRed2=0;
	String[] array = { "R1", "R1", "R1", "R1" };// "R1", "R1", "R1", "T1" };
	for(String string:array) {
		if(string.equals("R1")) {
			TotalRed1++;
			
		}
		First.add(string);
			
	}System.out.println(("TotalRed1 :"+" "+ TotalRed1));	
	String[] array2 = { "R2", "R2", "T2", "R2" };
	for(String string:array2) {
		if(string.equals("R2")) {
			TotalRed2++;
		}
		Second.add(string);
}System.out.println("TotalRed2:"+ " "+ TotalRed2);
String winner = "";
boolean flag= false;
while(!First.isEmpty()&&!Second.isEmpty()) {
	if(First.poll().equals("R1")) {
		TotalRed1--;
	}
}if(Second.poll().equals("R2")) {
	TotalRed2--;
}
if(TotalRed2>TotalRed1) {
	winner = "R1";
}else if ( TotalRed2<TotalRed1) {
	winner = "R2";
}else {
	System.out.println("It's a tie");
}
System.out.println(winner);
}
}
