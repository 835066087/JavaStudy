package day25_ReflectionDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//反射的应用，动态代理
//体会：反射的动态性

interface Human {

	String getBelief();

	void eat(String food);

}

//被代理类

class SuperMan implements Human {

	@Override
	public String getBelief() {
		return "I believe I can fly!";
	}

	@Override
	public void eat(String food) {
		System.out.println("我喜欢吃" + food);

	}
}

class HumanUtil{
	public void method1() {
		System.out.println("操作1");
	}
	
	public void method2() {
		System.out.println("操作2");
	}
}

//问题1：如何根据加载到内存中的被代理类对象，动态的创建一个代理类对象？

//问题2：当通过代理类的对象调用接口中声明过的方法a，如何动态的实现被代理类同名方法的调用

class MyProxy {
	// 动态的生成一个代理类的对象
	public static Object getProxyInstance(Object obj) {

		MyInvocationHandler handler = new MyInvocationHandler(obj);

		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);

	}

}

class MyInvocationHandler implements InvocationHandler {

	HumanUtil util = new HumanUtil();
	
	Object obj;

	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	// 当我们通过代理类的对象调用方法a时，自动执行invoke（）
	// 将被代理类对象的方法a调用，声明在如下invoke（）中
	// 形参method:即为代理类对象调用的方法a
	// 形参args：实际上是代理类的对象方法a的实参
	// 返回值：将被代理类对象方法a调用之后的返回值作为如下invoke的返回值

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object returnValue = method.invoke(obj, args);

		return returnValue;
	}

}

public class DynamicProxy {
	public static void main(String[] args) {

		SuperMan man = new SuperMan();
		Human proxyInstance = (Human) MyProxy.getProxyInstance(man);
		proxyInstance.eat("随便吧");
		
		String belief = proxyInstance.getBelief();
		System.out.println(belief);
		
		//代理模式的代理模式
		LianJia lianjia = new LianJia();
		HouseRent proxy = (HouseRent) MyProxy.getProxyInstance(lianjia);
		proxy.rent();
	}

}
