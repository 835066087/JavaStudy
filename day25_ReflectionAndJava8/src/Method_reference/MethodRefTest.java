package Method_reference;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * 方法引用的使用
 * 1.函数式接口实例化一定可以使用lambda表达式
 *   在某些特殊的情况下，lambda表达式还可以进一步改写为方法引用
 * 
 * 2.方法引用仍然作为函数式接口的实例
 * 
 * 3.如果lambda表达式对应的抽象方法的形参列表和返回值类型
 * 与另一个要调用的方法的形参列表和返回值类型一致，则用方法引用来替换lambda表达式
 * 
 * 4.格式：类（或对象） ：： 方法名
 * 
 * 5.具体来说
 * 	 5.1 对象::实例方法
 * 	 5.2 类::  静态方法
 * 	 5.3 对象:: 静态方法
 * 
 * 
 * 
 * 
 * 
 * 
 *
 * Created by shkstart.
 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {
		//Lambda表达式
		Consumer<String> con = str -> System.out.println(str);
		con.accept("这只是个示例");
		
		
		//方法引用
		PrintStream ps = System.out;
		Consumer<String> con1 = ps::println;
		con1.accept("哇我的老天爷");
		
		
	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		//Lambda表达式
		Employee emp = new Employee(1001,"马化腾",34,6000.38);
		Supplier<String> sup = () -> emp.getName();
		
		//方法引用
		Supplier<String> sup1 = emp::getName;
		System.out.println(sup1.get());
	}

	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {
		//Lambda表达式
		Comparator<Integer> com = (t1,t2) -> Integer.compare(t1,t2);
		System.out.println(com.compare(12,21));
		
		//方法引用
		Comparator<Integer> com1 = Integer::compare;
		System.out.println(com1.compare(23, 32));
		
	}
	
	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {
		//Lambda表达式
		Function<Double,Long> func1 = t -> Math.round(t);
		System.out.println(func1.apply(123.3));
		
		
		//方法引用
		Function<Double,Long> func2 = Math::round;
		System.out.println(func2.apply(1222.5));
		
	}

	// 情况三：类 :: 实例方法 
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		//Lambda表达式
		Comparator<String> com = (s1,s2) -> s1.compareTo(s2);
		System.out.println(com.compare("aaa", "asd"));
		
		//方法引用
		Comparator<String> com1 = String::compareTo;
		System.out.println(com1.compare("abc", "abc"));		
		
	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		//Lambda表达式
		BiPredicate<String,String> biPre = (str1,str2) -> str1.equals(str2);
		System.out.println(biPre.test("abc", "abc"));
	
		//方法引用
		BiPredicate<String,String> biPre1 = String::equals;
		System.out.println(biPre.test("abc", "abc"));
		
	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Employee e = new Employee(1001,"马化腾",34,6000.38);
		//Lambda表达式
		Function<Employee,String> func = emp -> emp.getName();
		System.out.println(func.apply(e));
	
		//方法引用
		Function<Employee,String> func1 = Employee::getName;
		System.out.println(func.apply(e));
	}

}
