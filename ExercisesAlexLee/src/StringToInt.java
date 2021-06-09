
public class StringToInt {
public static void main(String[] args) {
	
	String s = "104";
	int i = 4;
	System.out.println(Integer.parseInt(s)+4);
	System.out.println(Integer.toString(i));
String st = "Age 47";
st+=st.replaceAll("\\D+", "");
System.out.println(Integer.parseInt(st));


}
}
