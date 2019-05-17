package com.atguigu.javase.wrapper;

import org.junit.Test;

//包装类：把基本数据包装成对象
//int Integer
//byte Byte
//short Short
//long Long
//float Float
//double Double
//boolean Boolean
//char Character


public class WrapperTest {
	
	@Test
	public void test3() {
		double d = 3.88;
		Double obj1 = new Double(d);
		Double obj2 = d;
		
		double d3 = obj1.doubleValue();
		String string = "324.12";
		double d4 = Double.parseDouble(string);
		
		String string2 = "false";
		boolean b1 = Boolean.parseBoolean(string2);
		
		// Xxx.parseXxx("xxx") → xxx //把字符串转换成基本值
		// Xxx obj = new Xxx(xxx); //基本值装箱
		// xxx = obj.xxxValue(); //把对象中的基本值拆出来
		
	}

	@Test//测试方法，测试方法要求：所属类是公共的，方法无返回值无参
	public void test1(){
		//手工装箱
		Integer obj1 = new Integer(100);//把100这个值包装到对象中
		//自动装箱
		Integer obj2 = 200;//Integer.valueOf(200);
		
		//手工拆箱
		int n1 = obj1.intValue();
		//自动拆箱
		int n2 = obj2;
		
		Object object = 300;// Integer.valueOf(300);
		
		Object[] arr = {1,false,3.22,'c'};//建立一个多样数据类型的数组
		//装箱，手工和自动
		
		Integer obj = 200;
		Boolean boolean1 = true;
		
		int n3 = obj1 + obj2;
		
		
	}
	
}
