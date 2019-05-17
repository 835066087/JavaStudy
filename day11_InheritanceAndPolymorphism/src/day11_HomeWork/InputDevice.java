package day11_HomeWork;

public class InputDevice extends Device {

	private int speed;

	public InputDevice() {

	}

	public InputDevice(String name, int price, String factory, int speed) {
		super(name, price, factory);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override // 方法覆盖
	public String showDetail() {
		return super.showDetail() + ",输入速度:" + speed;
	}

}
