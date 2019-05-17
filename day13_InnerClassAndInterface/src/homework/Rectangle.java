package homework;

public class Rectangle {

	private double length;

	public Rectangle() {
		super();
	}

	public Rectangle(double length) {
		super();
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double calcArea() {
		double area = Math.pow(length, 2);
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + "]";
	}

}
