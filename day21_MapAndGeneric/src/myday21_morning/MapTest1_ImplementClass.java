package myday21_morning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import org.junit.Test;

/*
 * Map的常用类测试
 * 
 * 
 * 
 */
public class MapTest1_ImplementClass {

	// LinkedHashMap测试，频繁的遍历操作
	@Test
	public void Test1() {
		Map map = new LinkedHashMap();

		map.put("CC", 75);
		map.put(23, "CC");
		map.put("AA", 75);
		map.put("DD", 75);

		System.out.println(map);

	}

	// TreeMap测试

	// 要求：
	// 1.向TreeMap中添加的Key-Value，key必须是由同一个类创建的对象
	// 2.Key必须指明是自然排序还是定制排序
	// 3.TreeMap中所有的key彼此不相同，此时判断是否相同的标准为：
	// 如果是自然排序，则按照实现Comparable接口的compareTo（）方法判断
	// 如果是定制排序，则按照Comparator实现类的compare（）判断返回值

	@Test
	public void Test2() {

		/*
		 * Comparator comparator = new Comparator() {
		 * 
		 * @Override public int compare(Object o1, Object o2) { if (o1 instanceof Person
		 * && o2 instanceof Person) { Person p1 = (Person) o1; Person p2 = (Person) o2;
		 * 
		 * return p1.getName().compareTo(p2.getName()); } else { throw new
		 * RuntimeException("传入参数类型不匹配"); } } };
		 */

		Map map = new TreeMap();

		map.put("CC", 75);
		map.put("BB", 85);
		map.put("AA", 45);
		map.put("DD", 35);

		System.out.println(map);

		/*
		 * Hashtable Properties：key和value都是String，常用来处理配置文件
		 */
	}

	@Test
	public void Test3() throws IOException {
		Properties pros = new Properties();

		FileInputStream inStream = new FileInputStream("jdbc");

		pros.load(inStream);

		String name = pros.getProperty("name");
		String password = pros.getProperty("password");

		System.out.println("name = " + name + ",password = " + password);
	}

}
