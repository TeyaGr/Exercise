package Algorithms;

import java.util.ArrayList;

public class PseudoCode {
public static void main(String[] args) {
	
	int total = 0;
	int [] list = {1,3,5,7,9};
	for(int i:list) {
		total=+i;
	}
		if(total>0) {
			System.out.println(total + " "+ "it's positive");
		}else {
			System.out.println(total + " " +"its less that 0");
		}
	}

}
