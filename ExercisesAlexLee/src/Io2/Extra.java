package Io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Extra {
public static void main(String[] args) throws IOException {
	try {
	File file = new File("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\read.txt");
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	HashMap<String,Integer> map = new HashMap<>();
	System.out.println("Enter your text");
	String s =  bf.readLine();
	String [] array =s.split(" ");
	FileWriter fw = new FileWriter(file);
	fw.write(s);
	bf.close();
	fw.close();
	
	for( String key:array) {
		if(map.containsKey(key)) {
			map.put(key, map.get(key)+1);
		}else {
			map.put(key, 1);
		}
	}
	for(String key : map.keySet()) {
		System.out.println(key + " " +  map.get(key));
	

		
	}

	
	
	
	
}catch(Exception e) {
}
}
}
