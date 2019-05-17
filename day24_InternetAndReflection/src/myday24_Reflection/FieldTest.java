package myday24_Reflection;

import java.lang.reflect.Field;

import org.junit.Test;

public class FieldTest {

	@Test
	public void Test1() {
		
		Class clazz = Person.class;
		
		// getFields获取运行时类及其所有父类中声明为public权限的属性
		Field[] fields = clazz.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		
		//getDeclaredFields获取运行时类本类中的所有权限的属性
		clazz.getDeclaredFields();
		
		
	}
}
