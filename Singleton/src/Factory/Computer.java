package Factory;

public abstract class Computer {

	public abstract String getHDD();
	public abstract String getCPU();
	public abstract String getRAM();
	@Override
	public String toString() {
	return "RAM: " + this.getRAM() + " HDD: " + this.getHDD() + " CPU: " + this.getCPU();
	}
	
}
