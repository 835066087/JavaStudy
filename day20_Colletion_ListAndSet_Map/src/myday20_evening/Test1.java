package myday20_evening;

import java.util.HashSet;

import myday20_morning.Person;

public class Test1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet set = new HashSet();
		Person p1 = new Person("AA",1001);//2080
		Person p2 = new Person("BB",1002);
		//Person p3 = new Person("CC",1001);弱智才这么搞

		set.add(p1);//数组中的hash1 = 2080
		set.add(p2);//
		p1.name = "CC";//数组中的，和外部的p1的hash1 = 0
		System.out.println(p1);
		//只是更改操作，并未新建
		set.remove(p1);//这一步以后两个p1的hash1同时变成2144
		//
		
		System.out.println(set);

		set.add(new Person("CC",1001));
		//在这一步，因为上一个同内容的部分在位置为0的数组的链表中
		//因而这一步的“CC”，1001先运用hashCode（）方法，被归入了索引位置2，添加成功
		
		System.out.println(set);
		
		set.add(new Person("AA",1001));
		//这里之所以调取了equals方法
		//是因为p1的哈希值2与此处相同
		//这里equals的数据之所以不相等
		//是因为在此之前
		//数组[0]位置的数据已经被更改，故name不同
		//链表
		
		System.out.println(set);

	}

}
