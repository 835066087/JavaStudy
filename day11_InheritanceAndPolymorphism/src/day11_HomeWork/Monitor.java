package day11_HomeWork;

public class Monitor extends OutputDevice {

	private String color;

	public Monitor() {
	}

	public Monitor(String name, int price, String factory, int size, String color) {
		super(name, price, factory, size);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void display() {
		System.out.println("在用" + color + "的显示屏");
	}

	@Override
	public String showDetail() {
		return super.showDetail() + ",颜色：" + color;
	}

}
