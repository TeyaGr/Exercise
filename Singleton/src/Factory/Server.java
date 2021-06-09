package Factory;

public class Server extends Computer{
	private String ram;
	private String cpu;
	private String hdd;
	
	public Server(String ram, String cpu, String hdd) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return null;
	}
}
