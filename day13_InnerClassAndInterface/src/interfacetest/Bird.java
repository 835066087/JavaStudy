package interfacetest;

//具体类可以实现（implements)接口，相当于具体类的父类
//实现即把接口中的全部抽象方法实现了

public class Bird implements Flyer{
	
	private int flyspeed;

	@Override
	public void takeOff() {
		System.out.println("起飞了");
		
	}

	@Override
	public void fly() {
		System.out.println("小鸟在飞呀飞");
		
	}

	@Override
	public void land() {
		System.out.println("着陆了");
		
	}

}
