package myday24_Reflection;

import java.lang.reflect.Method;

import org.junit.Test;

public class MethodTest {

	@Test
	public void Test1() {
		//同属性一样
		Class clazz = Person.class;
		
		Method[] methods = clazz.getMethods();
		
		for (Method m : methods) {
			System.out.println(m);
		}
		
		Method[] declaredMethods = clazz.getDeclaredMethods();
		
		for (Method m1 : declaredMethods) {
			System.out.println(m1);
		}
	}
	
	
}
