package myday22_morning;

import java.util.List;

/*
 * 有条件的通配符使用
 * 
 * ？extends A:
 * G <A> 和 G <B> 可以看做是 G < ? extends A>的子类，其中，B类作为A类的子类。
 * 
 * ？super A:
 * G <A> 和 G <B> 可以看作是 G < ? extends A>的父类，其中，B类作为A类的父类。
 * 
 */


public class GenericTest {
	
	public static void main(String[] args) {
		
		List<Object> list1 = null;
		List<Person> list2 = null;
		List<Student> list3 = null;
		
		List<? extends Person> list4 = null;
		List<? super Person> list5 = null;
		
		//list4 = list1;
		list4 = list2;
		list4 = list3;
		
		
		list5 = list1;
		list5 = list2;
		//list5 = list3;
		
		//list4的读取和写入操作
		//读取：
		Person p1 = list4.get(0);
		//关注读取返回的数据类型
		//写入操作：只允许添加null值;
		list4.add(null);
		//list4.add(new Student());
		
		//list5的读取和写入操作
		//读取
		Object obj = list5.get(0);
		//写入操作
		list5.add(new Student());
		//list5.add(new Object());
		
		
		
		
	}
	
}
