package myday19_afternoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/*
 * ArrayList:List最主要的实现类
 * LinkedList
 * Vector
 *
 */

public class ListTest {
	
	@Test
	public void test1() {
		
		ArrayList list = new ArrayList();
		
		list.add(123);
		list.add(456);
		list.add(789);
		list.add(2);
		
		List list1 = Arrays.asList(1,2,3);
		list.addAll(3, list1);
		
		list.remove(2);
		list.remove((Integer)2);
		//list.remove(Object obj)
		//list.remove(int index)	
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
