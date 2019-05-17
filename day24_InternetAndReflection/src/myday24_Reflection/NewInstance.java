 package myday24_Reflection;

import java.util.Random;

import org.junit.Test;

public class NewInstance {
	
	//反射的应用1：创建运行时类的对象
	
	@Test
	public void Test1() throws InstantiationException, IllegalAccessException {
		Class clazz = Person.class;
		

		//创建运行时类的对象：newInstance();此方法调用了运行时类的空参构造器
		//要想执行成功，需要有相应的条件：
		//1.运行时类要有空参构造器
		//2.空参构造器的访问权限要够，一般为public
		
		
		Person p1 = (Person) clazz.newInstance();
		System.out.println(p1);
		
	}
	
	//反射的动态性
	@Test
	public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		int num = new Random().nextInt(3);// 0 ,1 ,2
		String className = null;
		switch(num) {
		case 0 :
			className = "java.lang.Object";
			break;
		case 1:
			className = "java.util.Date";
			break;
		case 2 :
			className = "myday24_Refilection.Person";
			break;
			
		}
		Object obj = getInstance(className);
		System.out.println(obj);
	}
	
	
	
	public Object getInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName(className);
		return clazz.newInstance();
	}
	
	
	
	
	
	
}
