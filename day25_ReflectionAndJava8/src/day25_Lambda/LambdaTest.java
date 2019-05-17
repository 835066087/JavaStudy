package day25_Lambda;

import java.util.Comparator;

import org.junit.Test;

/*
 * 
 *  Lambda表达式举例
 * 
 * 
 */

public class LambdaTest {

	// 提供接口的匿名实现类对象
	@Test
	public void Test1() {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("111");
			}
		};

		r1.run();

		// ********************************

		// Lambda表达式
		Runnable r2 = () -> {
			System.out.println("111");
		};

		r2.run();
	}

	@Test
	public void Test2() {
		Comparator<Integer> com1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		System.out.println(com1.compare(12, 100));
		
		
		// *********************
		//Lambda表达式
		Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
		System.out.println(com2.compare(32, 100));
		
		
		// *********************
		//方法引用
		Comparator<Integer> com3 = Integer :: compare;
		System.out.println(com3.compare(21, 21));
	}

}
