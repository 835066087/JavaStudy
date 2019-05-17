package day06;

import java.awt.print.Printable;

/*
 * 一、数组的概述
 * 1.数组：多个相同数据类型的组合
 * 2.使用数组的目的，为了便于对数据进行统一管理
 * 3.其中，多个相同数据类型的变量就称为数组的元素，那么数组的元素可以是任何数据类型
 *	 数组本身是引用数据类型，它的数据是对象，数组的元素就相当于是其属性
 * 
 * 二、一维数组的使用
 * 1.一维数组的创建，声明、初始化
 * 2.如何调用数组指定位置的元素，通过角标的方式
 * 3.数组的属性：length表数组的长度
 * 4.如何遍历数组元素(从0~i＜数组的长度）
 * 5.一维数组的使用（5-6）
 * (1)整型：byte \ short \ int \ long，默认初始化值为：0
 * (2)浮点型：float \ double 默认初始化值：0.0
 * (3)字符型：char 默认初始化值为0或\u0000（形式上是个空格，但并非是）
 * (4)布尔型：boolean型的默认初始化值为false
 * (5)引用数据类型的默认初始化值为：null
 * 6.一维数组的内存解析
 */
class ArrayTest {
	public static void main(String[] args) {
		
		String[] names;//声明
		names = new String[]{"xx","yy","uu"};
		//可以简化为String [] name1 ={"xx","yy","uu"};
		//静态初始化：数组的创建与数据元素的赋值同时进行。
		
		int[] id = new int[3];
		//动态初始化-数组的创建与数据元素的赋值分开进行。括号内数字指元素数量。
		//不论是静态初始化还是动态初始化，数组一旦创建，长度就是确定的。
		//1结束
		//2开始
		//数组的角标从0开始，到数组的长度 - 1 结束。
		//本质上是首地址+偏移
		id[0] = 1001;
		id[1] = 1002;
		id[2] = 1003;
		
		//3.数组的属性：length表数组的长度
		System.out.println(id.length);
		System.out.println(names.length);
		
		//4.如何遍历数组元素(从0~i＜数组的长度）遍历和赋值最好分开
		for(int i = 0; i < id.length; i++){
			System.out.println(id[i]);
		}
		for(int i = 0; i < names.length;i++){
			System.out.println(names[i]);
		}
		
		//5.数组元素的默认初始化值
		int[] ids = new int[3];
		
		for(int i = 0; i < ids.length;i++ ){
			System.out.println(ids[i]);
		}
		
		//6.引用数组,对象数组

	}
	
}
