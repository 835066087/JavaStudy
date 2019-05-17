package myday20_morning;
/*
 * List:有序的，可重复的数据
		  ArrayList（List的主要实现类）：线程不安全的，效率要高一些，底层使用Object[] 存储
		  LinedList：对于频繁地插入和删除操作，此类效率高，底层使用双向链表存储数据
		  Vector:（List的古老实现类）：线程安全的，效率差一点，底层使用Object[] 存储
		  
		  Collections中调用方法synchronizedList（List list）
		    可以将线程不安全的List，转化为线程安全的list
		    
		  ArrayList底层实现原理：
		  
		  jdk 7 中的源码：
		  ArrayList list = new ArrayList（）；//this.elementData = new Object[10]
		  list.add(123);//element[0] = 123;
		  ……
		  list.add(123);//element[9] = 123;
		  list.add(123);//element[10] = 123;//扩容，默认为1.5倍，遍历赋值到新数组
		  
		  总结：开发中建议使用：ArrayList（initialCapacity）构造器，显式指明底层数组容量
		  
		  jdk 8 中的源码：
		  ArrayList list = new ArrayList（）；//this.elementData = {}，即，没有创建长度为10的数组了
		  list.add(123);//首次添加数据，底层创建长度为10的数组
		  扩容的方式与原来相同
		  
		  
		  
		  LinkedList底层实现原理，底层使用双向链表存储数据:
		  
		  底层存储的数据封装在一个一个的Node中，Node定义如下：
		  private static class Node< E >{
		  E item;
		  Node< E > next;
		  Node< E > prev;
		  详参day12 LinkTest；
		  
		  
		  Vector的底层实现：new Vector（）；//底层创建长度为10的Object数组，默认扩容为原来2倍
	
 * 
 */

public class ListTest {

}
