package myday21_afternoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/*
 *
 *泛型的使用
 *
 *说明：
 *1.集合接口或类在声明时，使用了泛型，在类的实例化中，指明泛型参数的具体类型
 *2.一旦指明了泛型参数的具体类型，则泛型类或接口中，凡是使用了类或接口的泛型参数未知，都变为指定的数据类型
 *3.泛型参数只能使用引用数据类型进行赋值
 *4.如果集合在实例化时，没有使用泛型。此时默认泛型的参数类型Object。//因为1.5才使用泛型
 *
 * 
 */

public class GenericTest {

	@Test
	public void Test1() {
		List list = new ArrayList();

		list.add(81);
		list.add(99);
		list.add(75);
		list.add(60);
		list.add(50);
		list.add(97);

		// 1.添加数据时，可能存在类型不安全
		list.add("tom");

		Iterator /* <Integer> */ iterator = list.iterator();
		while (iterator.hasNext()) {
			// 2.强转时，可能出现类型转换异常
			int score = (int) iterator.next();
			System.out.println(score);
		}

	}

	// 在集合中使用泛型
	@Test
	public void Test2() {
		List<Integer> list = new ArrayList<Integer>();

		list.add(30);
		list.add(90);
		list.add(88);
		list.add(86);
		list.add(87);
		list.add(92);
		list.add(95);
		// 编译不通过
//		list.add("AA");

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int score = iterator.next();
			System.out.println(score);
		}

	}

	@Test
	public void Test3() {

		// JDK7时新增
		//Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<>();

		map.put("Tom", 68);
		map.put("Tiger", 68);
		map.put("Jerry", 68);
		map.put("Cindy", 68);
		map.put("Bob", 68);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
	}
	
	

}
