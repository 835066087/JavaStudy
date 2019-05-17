package homework;

public class TestInterface {

	public static void main(String[] args) {

		ComparableCircle c1 = new ComparableCircle(9.0);
		ComparableCircle c2 = new ComparableCircle(10.0);

		System.out.println(c1.calcArea());
		System.out.println(c2.calcArea());

		switch (c1.compareTo(c2)) {
		case 0:
			System.out.println("两圆面积相等");
			break;

		case 1:
			System.out.println("前者面积大于后者");
			break;

		case -1:
			System.out.println("后者面积大于前者");
			break;

		}
		
		System.out.println("**************************");
		//分割线，上面是圆形面积的测试，下面是方形面积的测试
		
		CompareRectangle r1 = new CompareRectangle(10);
		CompareRectangle r2 = new CompareRectangle(5);
		
		System.out.println(r1.calcArea());
		System.out.println(r2.calcArea());
		
		switch (r1.compareTo(r2)) {
		case 0:
			System.out.println("两方形面积相等");
			break;

		case 1:
			System.out.println("前者面积大于后者");
			break;

		case -1:
			System.out.println("后者面积大于前者");
			break;

		}

	}
}
