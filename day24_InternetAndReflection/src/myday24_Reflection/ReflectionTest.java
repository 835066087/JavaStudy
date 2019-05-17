package myday24_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {

	//不使用反射
	@Test
	public void Test1() {
		
		Person p1 = new Person("Tom",12);
		System.out.println(p1);

		
		p1.age=23;
		System.out.println(p1.age);
		
		p1.show();
	}
	
	//使用反射
	@Test
	public void Test2() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class clazz = Person.class;
		Constructor con = clazz.getConstructor(String.class,int.class);
		Person p1 =( Person )con.newInstance("Tom",12);
		System.out.println(p1);
		
		Field age = clazz.getField("age");
		age.set(p1, 23);
		System.out.println(age.get(p1));
		
		
		Method show = clazz.getMethod("show");
		show.invoke(p1);
		
		//通过反射，可以再Person类的外部，调用Person私有的内容
		//创建私有构造器对象
		Constructor con1 = clazz.getDeclaredConstructor(String.class);
		con1.setAccessible(true);
		Person p2 = (Person) con1.newInstance("Jerry");
		System.out.println(p2);
		
		//调用私有的属性
		Field name = clazz.getDeclaredField("name");
		name.setAccessible(true);
		name.set(p2, "Jack");
		
		//调用私有的方法
		Method seceret = clazz.getDeclaredMethod("seceret");
		seceret.setAccessible(true);
		seceret.invoke(p2);
	}
	
}
