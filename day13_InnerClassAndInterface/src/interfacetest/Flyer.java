package interfacetest;

//接口：把不同类的不同种事物的共同的行为抽象出来
//接口中的方法全部都是公共的抽象方法(public abstract)
//接口中的属性全是全局常量（public static final)——很少有属性

public interface Flyer {
	
	public abstract void takeOff();
	
	void fly();
	
	void land();
}
