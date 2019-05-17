package myday24_Reflection;

import org.junit.Test;

public class ReflectionTest1 {

	/*
	 * Class的理解
	 * java源程序经过javac.exe命令后，会生成一个或多个.class字节码文件
	 * 接着使用java.exe命令将其加载（使用类的加载器）到内存（方法区中缓存）中执行，
	 * 此字节码文件对应的类就称为运行时类，
	 * 此时的运行时类，就作为了Class的实例
	 * 
	 * 描述类的类
	 * Class的实例就指向一个具体的运动时类
	 * 
	 * Class是反射的源头
	 *      
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void Test1() throws ClassNotFoundException {
		//方式一:调用运行时类的属性
		Class clazz = Person.class;
		//System.out.println(clazz);
		
		//方式二：通过运行时类的对象获取
		Person p = new Person();
		Class clazz1 = p.getClass();
		//System.out.println(clazz1);
		System.out.println(clazz == clazz1);
		
		//方式三：调用Class静态方法：forNmae(String className)
		Class clazz2 = Class.forName("myday24_Refilection.Person");
		System.out.println(clazz == clazz2);
	}
	
	
	
	
	
	
	
}


