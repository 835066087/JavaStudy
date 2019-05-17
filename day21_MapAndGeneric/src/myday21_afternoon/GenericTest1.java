package myday21_afternoon;

import java.util.List;

import org.junit.Test;

public class GenericTest1 {
	
	@Test
	public void Test1() {
		//没有指定泛型的参数
		Order order = new Order();
		order.show(123);
		
		//制定泛型参数
		Order<Integer> order1 = new Order<>();
		order1.show(34);
		order1.t = 45;
		
		
		//测试泛型方法
		//在调用泛型方法时，指明方法中的泛型参数，与类的泛型没有关系
		//泛型方法所在的类没有要求，是不是泛型类都可以
		String[] arr = new String[] {"AA","BB","CC"};
		List<String> list = order1.copyFromArrayToList(arr);
	}
	
}
