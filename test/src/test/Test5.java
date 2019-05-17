package test;

public class Test5 {
	public static void main(String[] args) {
		int count = 8;
		int age = getAge(count);
		System.out.println("第" + count + "个人的年龄:" + age);
	}

	public static int getAge(int count) {
		if (count == 1) {
			return 10;
		} else {
			return getAge(count - 1) + 2;
		}
	}
}
