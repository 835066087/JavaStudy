package day25_ReflectionDynamicProxy;
//静态代理
//代理模式：把代理对象当做被代理对象来使用
//使用场景：
//1.被代理类是谁不知道，只知道业务接口，被代理对象的参数极其复杂，不方便调用，通过业务找到代理类
//2.对被代理类的方法有升级的需要，在不修改被代理类的情况下完成对于业务方法的升级处理 AOP,面对切面编程

interface HouseRent {
	void rent();
}

class FangDong implements HouseRent {//被代理对象

	@Override
	public void rent() {
		System.out.println("房屋出租");

	}

}

class FangDong2 implements HouseRent{

	@Override
	public void rent() {
		System.out.println("房屋出租2");
		
	}
	
}

class LianJia implements HouseRent {
	private HouseRent renter = new FangDong2();

	@Override
	public void rent() {
		System.out.println("请交中介费");
		renter.rent();
		System.out.println("不及时交房租，就赶走");
	}

}

public class ProxyTest {

	public static void main(String[] args) {
		HouseRent hr = new LianJia();
		hr.rent();
	}
}
