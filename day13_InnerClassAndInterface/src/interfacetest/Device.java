package interfacetest;

public abstract class Device {

	private static int no = 1;
	
	private final int ID;
	private String name;
	
	{
		ID = no++;
	}

	public Device() {
		super();
	}

	public Device(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return ID;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void startup();

	public abstract void shutdown();

}
