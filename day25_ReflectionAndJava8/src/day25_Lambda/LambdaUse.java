package day25_Lambda;

import java.util.function.Consumer;

import org.junit.Test;

/*
 * 
 * Lambda表达式的使用
 * 1.举例（o1,o2) -> Integer.compare(o1,o2)
 * 2.格式：
 * 		-> : lambda操作符或箭头操作符
 * 		其左边：lambda形参列表（对应原来接口中重写的方法的形参列表）
 * 		其右边：lambda体（对应原来接口中重写的方法的方法体）
 * 
 * 3.分六种情况，进行迭代说明
 * （1） lambda形参列表的数据类型可以省略；如果形参只有一个，可以省略一对（）
 * （2） lambda体如果只有一行执行语句，则可以省略一对{}，以及return关键字
 * 
 * 4.说明：Lambda表达式作为接口的匿名实现类的对象出现，其本身就是一个对象
 * 
 * 5.适用范围（函数式接口）
 * 如果一个接口中，只声明了唯一一个抽象方法，则此接口称为函数式接口
 * 可以使用@FunctionalInterface检验
 * 
 * 6.在java.util.function包下定义了Java 8 的丰富的函数式接口
 * Consumer<T>
 * Supplier<T>
 * Function<T, R>
 * Predicate<T>
 * 
 * 
 * 
 */

public class LambdaUse {

	// 格式1：无参无返回值
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
	
	// 格式2 ： Lambda需要一个参数，但没有返回值
	@Test
	public void Test2() {
		Consumer<String > con = new Consumer<String>() {
		
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		con.accept("没有区别");
		
	
		//*************************
		Consumer<String> con1 = (String t) -> {
			System.out.println(t);
		};
	}
	
	//
	@Test
	public void Test3() {
		
	}

}
