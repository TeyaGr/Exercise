package StackAndQueue;

import java.util.Stack;

public class CorrectnessOfBrackets {

	public static void main(String[] args) {
		
		String brackets = "><<<>>>";
		String [] a = brackets.split("");


		boolean check = false;
		for(String b:a) {
			if(b.equals("<")){
				s.push(b);
				
				
			}else {
			if(s.isEmpty()) {
				check = false;
				break;
			}else {
				s.pop();
				check=true;
			}
		}
		
	}
		System.out.println(check);
}
}
