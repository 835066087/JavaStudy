package day11_HomeWork;

public class Keyboard extends InputDevice {

	private int keycount;

	public Keyboard() {

	}

	public Keyboard(String name, int price, String factory, int speed, int keycount) {
		super(name, price, factory, speed);
		this.keycount = keycount;
	}

	public int getKeycount() {
		return keycount;
	}

	public void setKeycount(int keycount) {
		this.keycount = keycount;
	}

	public void press() {
		System.out.println("在敲击" + keycount + "键的键盘");
	}

	@Override
	public String showDetail() {
		return super.showDetail() + "，键位" + keycount;
	}
}
