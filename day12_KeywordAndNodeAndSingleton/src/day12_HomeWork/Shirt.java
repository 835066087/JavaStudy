package day12_HomeWork;

public class Shirt extends Frock {//继承

	public Shirt() {//无参构造器
		super();
	}

	public Shirt(int size, String color, double price) {//全参构造器
		super(size, color, price);
	}

	@Override
	public void calcArea() {//对抽象父类方法的重写
		double area = getSize() * RATIO;
		System.out.println("衬衣所需布料为:" + area);
	}

	
}
