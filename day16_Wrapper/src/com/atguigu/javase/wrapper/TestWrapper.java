package com.atguigu.javase.wrapper;

import org.junit.Test;

public class TestWrapper {

	@Test
	public void test1() {

		String obj1 = "100";
		String obj2 = "200";

		int n1 = Integer.parseInt(obj1);
		//第一个转换成基本型
		
		Integer obj3 = new Integer(n1);
		//手工装箱
		
		Integer ojb5 = Integer.decode(obj2);
		Integer obj4 = Integer.valueOf(obj2);
		//第二个直接变成integer对象
		
		int sum = obj3.intValue() + obj4.intValue();
		System.out.println(sum);
		
		int multi = obj3 * obj4;
		System.out.println(multi);
	}

}
