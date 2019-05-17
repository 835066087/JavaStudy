package myday19_afternoon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void Test1() {
		Collection coll = new ArrayList();

		coll.add(123);
		coll.add(321);
		coll.add(456);

		Iterator iterator = coll.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 错误1
		// while(iterator.next() != null){
		// System.out.println();

		// 错误2：每次调用iterator（），都会返回一个新的迭代器对象
		// while（coll.iterator().hasNext()){
		// System.out.println(coll.iterator().next());

	}

	@Test
	public void Test2() {
		Collection coll = new ArrayList();

		coll.add(123);
		coll.add(321);
		coll.add(456);

		for (Object obj : coll) {
			System.out.println(obj);
		}
	}

}
