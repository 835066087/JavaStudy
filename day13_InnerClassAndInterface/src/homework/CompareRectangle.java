package homework;

public class CompareRectangle extends Rectangle implements CompareObject {

	// 对象引用
	Rectangle a = new Rectangle();

	public CompareRectangle() {
		super();
	}

	public CompareRectangle(double length) {
		super(length);
	}

	// 比较面积方法的重写
	@Override
	public int compareTo(Object o) {
		Rectangle a1 = (Rectangle) o;
		int i = 0;
		if (this.calcArea() > a1.calcArea()) {
			i = 1;
		} else if (this.calcArea() < a1.calcArea()) {
			i = -1;
		}
		return i;
	}

}
