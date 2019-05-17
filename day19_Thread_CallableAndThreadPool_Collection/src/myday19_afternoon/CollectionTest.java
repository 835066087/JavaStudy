package myday19_afternoon;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void test1() {

		Collection coll = new ArrayList();
		Collection coll1 = new ArrayList();

		// 1.add(Object obj)
		coll.add(123);
		coll.add(456);
		coll1.add(754);
		coll1.add(554);
		
		System.out.println(coll);
		
		coll.addAll(coll1);
		
		System.out.println(coll);
		
		//isEmpty();
		//clear（）；
		//remove（）；
		//hashcode（）；获取集合对象的哈希值
		//toArray（）；
		//iterator()
		

	}

}
