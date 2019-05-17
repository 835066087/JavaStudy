package day12_HomeWork;

public abstract class Frock {
	//静态属性
	public static final int INCREMENT = 100;
	public static final double RATIO = 1.3;// 全局常量，任意位置处只要通过类名.常量名即可访问
	private static int currentNum = 100000;
	
	//非静态属性
	private int size;
	private String color;
	private double price;
	private int serialNumber;
	
	//无参构造器
	public Frock() {
		super();
	}

	//全参构造器
	public Frock(int size, String color, double price) {
		super();
		this.serialNumber = getNextNum();//调用方法自动生成序列号
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public static int getNextNum() {
		return currentNum += INCREMENT;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public static int getIncrement() {
		return INCREMENT;
	}

	public static double getRatio() {
		return RATIO;
	}
	
	//抽象方法calcArea
	public abstract void calcArea();

	@Override
	public String toString() {
		return "Frock [serialNumber=" + serialNumber + ",size=" + size + ", color=" + color + ", price=" + price + "]";
	}

}
