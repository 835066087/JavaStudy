package Afternoon;

public class PetTest {

	public static void main(String[] args) {

		Pet b = new Bird("小飞", 21, 1, 30);
		
		b.speak();//纯虚拟方法
		b.eat();
	}
}
