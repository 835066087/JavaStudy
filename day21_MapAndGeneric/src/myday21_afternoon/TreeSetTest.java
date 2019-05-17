package myday21_afternoon;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetTest {

	@Test
	public void Test1() {

		String name;
		int year;
		int month;
		int day;
		int age;
		Employee employee[] = new Employee[5];

		String[] name1 = { "李", "王", "赵", "钱", "周", "吴", "郑", "王" };
		String[] name2 = { "维", "强", "林", "苞", "明", "闵", "旻", "雯" };

		// 利用随机通过数组方式产生5名员工
		for (int i = 0; i < 5; i++) {
			int randIndex1 = (int) (Math.random() * 100) % name1.length;
			int randIndex2 = (int) (Math.random() * 100) % name2.length;
			name = name1[randIndex1] + name2[randIndex2];
			year = (int) (Math.random() * 100 + 1919);
			month = (int) (Math.random() * 12 + 1);
			day = (int) (Math.random() * 30 + 1);
			Mydate d1 = new Mydate(year, month, day);
			age = 2019 - year;

			employee[i] = new Employee(name, age, d1);
		}

		// 实现Comparator从而按生日日期的先后进行排序
		Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Employee && o2 instanceof Employee) {
					Employee e1 = (Employee) o1;
					Employee e2 = (Employee) o2;

					// return new Integer(e1.getAge()).compareTo(new Integer(e2.getAge()));
					// 要调用compareTo方法必须进行包装，使其变成包装类，否则只能新写compareTo方法,新写如下：
					int a = e1.getAge();
					int b = e2.getAge();
					return ((a < b) ? -1 : (a == b) ? 0 : 1);
					//只关心正负，正数前大，负数前小

				} else {
					throw new RuntimeException("传入数据类型不匹配");
				}
			}
		};

		// 将数组内元素插入TreeSet中，并依据comparator排序
		TreeSet set = new TreeSet(comparator);

		set.add(employee[0]);
		set.add(employee[1]);
		set.add(employee[2]);
		set.add(employee[3]);
		set.add(employee[4]);

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Test
	public void Test2() {

		String name;
		int year;
		int month;
		int day;
		int age;
		Employee employee[] = new Employee[5];

		String[] name1 = { "李", "王", "赵", "钱", "周", "吴", "郑", "王" };
		String[] name2 = { "维", "强", "林", "苞", "明", "闵", "旻", "雯" };

		// 利用随机通过数组方式产生5名员工
		for (int i = 0; i < 5; i++) {
			int randIndex1 = (int) (Math.random() * 100) % name1.length;
			int randIndex2 = (int) (Math.random() * 100) % name2.length;
			name = name1[randIndex1] + name2[randIndex2];
			year = (int) (Math.random() * 100 + 1919);
			month = (int) (Math.random() * 12 + 1);
			day = (int) (Math.random() * 30 + 1);
			Mydate d1 = new Mydate(year, month, day);
			age = 2019 - year;

			employee[i] = new Employee(name, age, d1);
		}

		TreeSet set = new TreeSet();

		set.add(employee[0]);
		set.add(employee[1]);
		set.add(employee[2]);
		set.add(employee[3]);
		set.add(employee[4]);

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
