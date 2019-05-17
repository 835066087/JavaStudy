package myday20_morning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
 * 			Set：无序的、不可重复的数据----集合
 * 					HashSet：作为Set的主要实现类
 * 						LinkedHashSet：HashSet的子类，可以实现按照元素添加的顺序实现遍历
 * 										如果需要频繁的遍历，建议使用
 * 					TreeSet：底层使用红黑树进行存储。可以按照添加的元素的指定的属性进行排序
 * 
 * 
 * 			结论1：向Set中添加的数据，要求数据所在的类要重写hashCode（）和equals（）；
 * 			结论2：重写的hashCode（）和equals（）要保证一致性！
 */

public class SetTest {

	/*
	 * Set：无序的、不可重复的数据。以HashSet为例说明
	 * 
	 * 1.无序性： 不等同于随机性 指的是存储的数据在内存中不是依次紧密排列的
	 * 
	 * 2.不可重复性：综合使用hashCode（）和equals（），判断是否是重复数据
	 * 
	 * 
	 * 向HashSet中添加元素的具体过程：（jdk 7.0 ： HashSet的底层使用数组+链表）底层用Map
	 * 
	 * 向HashSet中添加元素A，首先调用元素A所在类的hashCode（），计算元素A的哈希值1，（经过算法后得到hash值2）
	 * 哈希值2经过某种算法后，计算得到在数组中的索引i 
	 * 1）如果此索引位置i没有任何元素，则元素a添加成功
	 * 2）如果此索引位置i有元素b，此时比较元素a和b的哈希值2，如果哈希值不同，此时元素A添加成功
	 * 												 如果哈希值相同，此时调用A所在类的equals,返回true，添加失败
	 * 
	 * 1）中元素a添加到数组指定索引位置 2）中两个情况以链表方式存储（七上八下）
	 * 
	 * 
	 * 
	 */
	@Test
	public void Test1() {

		Set set = new HashSet();// 底层数组的长度是16

		set.add(123);
		set.add("aa");
		set.add("aa");
		set.add("mm");

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Test
	public void Test2() {
		// 底层在HashSet底层结构的基础上，使用了双向链表，记录添加元素的前一个和后一个元素
		Set set = new LinkedHashSet();// 底层数组的长度是16

		set.add(123);
		set.add("aa");
		set.add("aa");
		set.add("mm");

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	/*
	 * TreeSet的使用
	 * 
	 * 1.向TreeSet中添加的数据，必须是同一个类创建的对象，否则会报ClassCastException
	 * 2.添加到TreeeSet中的数据，可以按照指定的方式进行排序
	 * 3.对象如何排序？（即，对象也可以比较大小）
	 * 		方式一：自然排序
	 * 				要求元素所在的类要实现Comparable接口，并实现compareTo方法
	 * 
	 * 		方式二：定制排序
	 * 				需要提供Comparator接口的实现类，并实现compare（Object o1 ,Object o2）
	 * 
	 * 
	 * 向TreeSet中添加数据，判别两个对象是否相等的标准，不再是hashCode（）和equals（）
	 * 而是自然排序中compareTO（）或定制排序中compare（）；
	 * 
	 */

	@Test
	public void Test3() {

		TreeSet set = new TreeSet();

		set.add(345);
		set.add(100);
		set.add(200);
		set.add(99);

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void Test4 () {
		
		/*
		 * 引用数据类型的TreeSet举例
		 * 要在引用数据类型中的类中实现Comparable方法，重写compareTo方法
		 */
		TreeSet set = new TreeSet();
		
		Person p1 = new Person("Tom",12);
		Person p2 = new Person("Jerry",34);
		Person p3 = new Person("John",42);
		Person p4 = new Person("Mike",43);
		Person p5 = new Person("Rose",2);
		Person p6 = new Person("Jack",2);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void Test5() {
		
		//Comparator接口
		Comparator comparator = new Comparator(){

			//按照姓名从大到小排序
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					
					Person p1 = (Person)o1;
					Person p2 = (Person)o2;
					
					return -p1.getName().compareTo(p2.getName());//在这一步控制顺序
					
				}else{
//					return 0;
					throw new RuntimeException("传入的类型不匹配");
				}
			}
		};

		TreeSet set = new TreeSet(comparator);
		
		Person p1 = new Person("Tom",12);
		Person p2 = new Person("Jerry",34);
		Person p3 = new Person("John",42);
		Person p4 = new Person("Mike",43);
		Person p5 = new Person("Rose",2);
		Person p6 = new Person("Jack",2);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void test6() {
		Person p1 = new Person("Tom",12);
		Person p2 = new Person("Jerry",34);
		Person p3 = new Person("John",42);
		Person p4 = new Person("Mike",43);
		Person p5 = new Person("Rose",2);
		Person p6 = new Person("Jack",2);
		
		Person[] pers = new Person[]{p1,p2,p3,p4,p5,p6};
//		Arrays.sort(pers);
		
		Comparator comparator = new Comparator(){

			//按照姓名从大到小排序
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					
					Person p1 = (Person)o1;
					Person p2 = (Person)o2;
					
					return -p1.getName().compareTo(p2.getName());
					
				}else{
//					return 0;
					throw new RuntimeException("传入的类型不匹配");
				}
			}
		};
		
		//Arrays.sort(a, c);//a即Array，c即Comparator
		Arrays.sort(pers, comparator);
		
		System.out.println(Arrays.toString(pers));
	}
}
