package day25_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

/*
 * 
 * java8提供的4个核心函数接口
 * 
 * Consumer<T> void accept(T t)
 * Supplier<T> T get()
 * Function<T, R> R apply(T t)
 * Predicate<T> boolean test(T t)
 * 
 */

public class LambdaInterface {

	@Test
	public void Test1() {
		happyTime(400, new Consumer<Double>() {

			@Override
			public void accept(Double money) {
				System.out.println("测试");
			}

		});
		
		happyTime(400,money -> System.out.println("测试"));
		
		
	}

	public void happyTime(double money, Consumer<Double> con) {
		con.accept(money);
	}
	
	
	@Test
	public void Test2() {
		List<String> list = Arrays.asList("是","是","是","是","否","否","是","是","是");
		
	}

	private List<String> filterData(List<String> list, Object object) {
		return null;
	}
	
	

}
