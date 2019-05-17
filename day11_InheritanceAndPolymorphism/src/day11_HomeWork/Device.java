package day11_HomeWork;

public class Device {

	private String name;
	private int price;
	private String factory;

	public Device() {// 无参构造器

	}

	public Device(String name, int price, String factory) {// 全参构造器
		super();
		this.name = name;
		this.price = price;
		this.factory = factory;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String showDetail() {
		return "产品名:" + name + ",价格:" + price + "元,出厂商:" + factory;
	}

}
