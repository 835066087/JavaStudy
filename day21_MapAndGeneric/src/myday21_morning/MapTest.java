package myday21_morning;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
 * Map常用操作
 * 添加、删除、修改操作：
	Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
	void putAll(Map m):将m中的所有key-value对存放到当前map中
	Object remove(Object key)：移除指定key的key-value对，并返回value
	void clear()：清空当前map中的所有数据
   元素查询的操作：
	Object get(Object key)：获取指定key对应的value
	boolean containsKey(Object key)：是否包含指定的key
	boolean containsValue(Object value)：是否包含指定的value
	int size()：返回map中key-value对的个数
	boolean isEmpty()：判断当前map是否为空
	boolean equals(Object obj)：判断当前map和参数对象obj是否相等
   元视图操作的方法：
	Set keySet()：返回所有key构成的Set集合
	Collection values()：返回所有value构成的Collection集合
	Set entrySet()：返回所有key-value对构成的Set集合

 * 
 * 如何理解Map和List的使用呢？
 * 如一个小程序，每个功能下依次排列的项目，可以用List
 * 在这些项目里的图片，文字信息等，用Map * 
 * 
 * 
 * 总结：
 * 增：put(Object key,Object value)
 * 删：Object remove(Object key)
 * 改：put(Object key , Object value)
 * 查：Object get (Object key)
 * （插入-没有，因为无序）
 * 长度：size();
 * 遍历：keySet() / values() / entrySet()
 * 
 * 
 */

public class MapTest {

	@Test
	public void Test1() {
		Map map = new HashMap();
		
		map.put("CC", 75);
		map.put(23,"CC" );
		map.put("AA", 75);
		map.put("DD", 75);
		
		System.out.println(map);
		
		map.remove(23);
		
		System.out.println(map);
		
		System.out.println(map.keySet());//给出里面的所有Key值
		System.out.println(map.entrySet());
		
	}
	
}
