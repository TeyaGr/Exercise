
public class Headphones {

	String charge= "Micro usb";
	String[] controls = {"power", "volume", "Skip", "Play/Pause"};
	static boolean power = false;
	static int volume = 0;
	public static void powerOn(){
		power = true;
	}
	public static void powerOf() {
		power = false;
	}
	public static void volumeUp() {
		volume++;
	}
	public static void volumeDown() {
		volume--;
	}
}
