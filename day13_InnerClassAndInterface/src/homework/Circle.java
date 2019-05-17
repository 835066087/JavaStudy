package homework;

public class Circle {

	public static final double PI = 3.14;

	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	public double calcArea() {
		double area = PI * Math.pow(radius, 2);
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
