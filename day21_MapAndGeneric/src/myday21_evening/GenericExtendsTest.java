package myday21_evening;

import java.util.ArrayList;
import java.util.List;

public class GenericExtendsTest {
	
	public static void main(String[] args) {

		//G<A>与G<B>
		/*List<Object> list1 = null;
		List<String> list2 = new ArrayList<String>();

		list2 = list1;*/
		//Type mismatch: cannot convert from List<Object> to 
		
		//A<G>与B<G>
		/*List<Object> list1 = null;
		ArrayList<Object> list2 = new ArrayList<Object>();
		list1 = list2;*/
		
		//G<A>与G<B>与G<?>
		List<Object> list1 = null;
		List<String> list2 = new ArrayList<String>();
		list2.add("AA");
		list2.add("BB");
		
		List<?> list3 = null;
		list3 = list1;
		list3 = list2;
		
		show2(list1);
		show2(list2);
		
//		list3.add(213);
		list3.add(null);
		//<?>通配符使用后只可写入null，其他都不可以
		
		Object obj = list3.get(0);
		//可以进行读取操作，返回值类型为Object

	}
	
	public static void show2(List<?> list) {
		
	}
}