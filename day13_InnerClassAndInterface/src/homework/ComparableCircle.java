package homework;

public class ComparableCircle extends Circle implements CompareObject {

	Circle a = new Circle();

	public ComparableCircle() {
		super();
	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	// 比较面积的重写
	@Override
	public int compareTo(Object o) {
		if (o instanceof Circle) {//造型有风险
			Circle o1 = (Circle) o;
			int i = 0;
			if (this.calcArea() > o1.calcArea()) {
				i = 1;
			} else if (this.calcArea() < o1.calcArea()) {
				i = -1;
			}
			return i;
		}
		return 0x7FFFFFFF;//抛出异常
	}

}