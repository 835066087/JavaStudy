package myday20_afternoon;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
 * 
 * 一、Map：存储一对一对的数据（键Key - 值value） ： 双列数据 ----- 函数
 * 			|----HashMap:Map的主要实现类：线程不安全的，效率高，可以存储null的key或value
 * 				|----LinkedHashMap：HashMap的子类，可以按照添加元素的先后顺序实现遍历。
 * 									（原因：使用了双向链表记录添加的元素的先后顺序）
 * 									（对于频繁地遍历操作，建议使用）
 * 			|----TreeMap：可以按照添加的元素的指定的属性进行排序，标准是KEY
 * 			|----Hashtable：Map的古老实现类：线程安全的，效率低，不可以存储null的key或value
 * 				|----properties:Key和value都是String类型，常用来处理String文件
 * 
 * Map概述详见PPT 51页
 * Key-Set
 * Value-Collection
 * 
 * Entry-Node --- Set
 * 
 * 二、Map中存储数据的特点：（以HashMap为例）
 * Map中的Key彼此是不可重复的，无序的，使用Set存储—-key所在类要重写hashCode和equals
 * Map中的value彼此是有序的，可重复的，使用Collection存储-value类要重写equals
 * Map中的一个key-value对，构成一个Map.Entry。
 * Map中的Entry彼此是不可重复的，无序的，使用Set存储
 * 
 * 三、
 * HashMap的底层实现原理：（jdk 7)数组（Entry[] table）+ 链表
 * 向HashMap中添加key1-value1。首先，根据key1所在类的hashCode（），计算key1的哈希值1，
 * 使用某种算法得到哈希值2，使用哈希值2通过某种算法得到key1-value1在底层table[]中的索引位置：i
 * 1)如果table[i] == null : 则此key1-value1添加成功----情况1
 * 2)如果table[i]位置上存在其他entry2(key2-value2),则比较key1和key2（,key3,……）的哈希值2；
 * 												如果和已有的entry的key的哈希值2彼此不同：则key1-value1添加成功，与key2-value2以链表方式共存----情况2
 * 												如果和已有的entry中的某一个entry的key的哈希值2彼此相同，继续比较二者的equals（）；
 * 																equals返回true：使用value1替换相同哈希值的value
 * 																equals返回false:继续与其他在索引i位置上的其他entry比较，如果都不相同，则添加成功---情况3
 * 
 * 情况1：将key1-value1添加到数组中
 * 情况2，情况3，将key1-value1与以后的key-value以链表的方式进行存储（七上八下）
 * 
 * 扩容问题
 * 默认情况下：（new HashMap（）创建的对象）此时底层数组的长度是16
 * 当达到临界值时（= 数组的长度（ default = 16 ） * 加载因子（ default = 0，75 ）），就考虑扩容，扩容为原来的2倍
 * 
 * 
 * jdk8 : 数组 + 链表 + 红黑树
 * 1.new HashMap（）：此时底层并没有创建长度为16的数组
 * 2.当首次调用put（）方法添加元素时，才在底层创建长度为16的数组//此两点与ArrayList相同
 * 3.新添加的元素与已有的元素如果以链表方式存储的话，jdk8中是旧的元素指向新添加的元素（即七上八下）
 * 4.当某一个索引i位置上的链表长度 > 8，且数组长度 > 64时，此索引i位置上的元素不再以链表继续存储，而改为红黑树
 * 
 * 
 * LinkedHashMap的底层实现原理：
 * 
 * 重写了HashMap的newNode
 * Entry中又继承了Node，在此基础上给了before和after，成为双向链表
 * 
 * static class Entry<K,V> extends HashMap.Node <K,V> {
 *      Entry<K,V> before, after;//记录前一个和后一个添加的元素
        Entry(int hash, K key, V value, Node<K,V> next) {
            super(hash, key, value, next);
        }
    }

 * 
 * 
 */

public class MapTest {

	@Test
	public void Test1() {
	Map map = new HashMap();
	map.put("AA", 99);
	map.put("AA", 90);
	
	System.out.println(map.get("AA"));
	
	System.out.println(map);
	
	}
}
