package day12_HomeWork;

public class FrockTest {
	
	public static void main(String[] args) {
		Shirt s1 = new Shirt(175,"绿色",10);
		System.out.println(s1);
		s1.calcArea();
		
		Frock s2 = new Shirt(180,"白色",20);
		System.out.println(s2);
		s2.calcArea();
	}
}
