package myday24_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest2 {

	//调用指定的属性
	@Test
	public void Test1() throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		Class clazz = Person.class;
		Person p = (Person) clazz.newInstance();
		
		//获取指定的属性
		Field field  = clazz.getField("age");
		
		field.set(p, 12);
		
		int age = (int)field.get(p);
		System.out.println(age);
		
		//************************************
		//第一步，通过getDeclaredField获取指定的属性
		Field field1 = clazz.getDeclaredField("name");
		//第二步，保证属性可修改
		field1.setAccessible(true);
		//第三步，调整或修改此属性的值
		field1.set(p, "小李");
		System.out.println(field1.get(p));
	}
	
	
	//调用指定的属性
	@Test
	public void Test2() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Person.class;
		Person p = (Person) clazz.newInstance();
		
		Method method = clazz.getDeclaredMethod("secret");
		method.setAccessible(true);
		method.invoke(p);
		
	}
	
	
}
