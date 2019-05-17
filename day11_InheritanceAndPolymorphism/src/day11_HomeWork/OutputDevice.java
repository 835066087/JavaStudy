package day11_HomeWork;

public class OutputDevice extends Device {

	private int size;

	public OutputDevice() {
	}

	public OutputDevice(String name, int price, String factory, int size) {
		super(name, price, factory);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String showDetail() {
		return super.showDetail() + ",尺寸：" + size + "英寸";
	}

}
