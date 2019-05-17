package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

import Method_reference.Employee;
import Method_reference.EmployeeData;

/*
 * 
 * 1.集合，是对内存中多个相同类型的变量进行存储，与内存打交道
 * StreamAPI：对内存中的集合数据进行相关的查询操作，与CPU打交道
 * 
 * 2.注意：
 * ①Stream 自己不会存储元素。
   ②Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream。
   ③Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行。

 *3.Stream使用的三步骤
 （1）- 创建 Stream
	一个数据源（如：集合、数组），获取一个流
	
 （2）- 中间操作
	一个中间操作链，对数据源的数据进行处理
	
 （3）- 终止操作(终端操作)
	一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
 * 
 * 4.创建Stream的三个方法
 * （1）使用集合
 * （2）使用数组
 */


public class StreamAPITest {

	@Test
	public void test1() {
		List<Integer> list = Arrays.asList(1,2,3,4);
		Stream<Integer> stream = list.stream();
		
		List<Employee> employees = EmployeeData.getEmployees();
		Stream<Employee> stream1 = employees.stream();
	}
	
	
	@Test
	public void test2() {
		
		IntStream stream = Arrays.stream(new int[] {1,2,3});
		
		Employee e1 = new Employee(1002, "马云", 12, 9876.12);
		Employee e2 = new Employee(1006, "比尔盖茨", 42, 9500.43);
		
		Employee[] emps = new Employee[] {e1,e2};
		Stream<Employee> stream1 = Arrays.stream(emps);
		
		
	}
	
	@Test
	public void test3() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		Employee e1 = new Employee(1002, "马云", 12, 9876.12);
		Employee e2 = new Employee(1006, "比尔盖茨", 42, 9500.43);
		Stream<Employee> stream1 = Stream.of(e1,e2);
	}
	
}
