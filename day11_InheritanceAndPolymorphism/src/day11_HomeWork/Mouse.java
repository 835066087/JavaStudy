package day11_HomeWork;

public class Mouse extends InputDevice {

	private boolean wireless;

	public Mouse() {

	}

	public Mouse(String name, int price, String factory, int speed, boolean wireless) {
		super(name, price, factory, speed);
		this.wireless = wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void move() {
		System.out.println("用鼠标在操作电脑");
	}

	@Override
	public String showDetail() {
		return super.showDetail() + "，鼠标有没有无线：" + wireless;
	}

}
