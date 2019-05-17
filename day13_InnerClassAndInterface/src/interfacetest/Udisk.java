package interfacetest;

public class Udisk implements USB {

	private int memory;

	public Udisk() {
		super();
	}

	public Udisk(int memory) {
		super();
		this.memory = memory;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public void connect() {
		System.out.println("已创建连接");
	}

	@Override
	public void work() {
		System.out.println("USB接口正在运行中");

	}

	@Override
	public void disconnect() {
		System.out.println("USB接口未创建连接");

	}

}
