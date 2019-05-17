package 附加题;

/*
 * 
 * 
 * 
 * 
 */

class Node {

	int value;
	Node next;
	private Node head = null;
	private Node tail = null;

	public void add(int value) {
		Node newNode = new Node();// 创建新对象
		newNode.value = value;// 写入数值域
		if (head == null) {// 衡量如果新加入数值为第一个链表头的情况
			head = newNode;// 如果是第一个，则加入的新Node既是头，也是尾
			tail = newNode;
		} else {
			tail.next = newNode;// 如果不是第一个，则旧尾巴的指针域指向新节点
			tail = newNode;// 尾巴变成新节点
		}
	}

	public int size() {// 通过计数器思想来完成
		Node tmp = head;// 从头开始遍历链表
		int count = 0;
		while (tmp != null) {// 当tmp为null时即遍历结束
			count++;// 每遍历一个数，计数一次
			tmp = tmp.next;// 迭代语句，让tmp等于tmp的下一个，最终让tmp归null
		}
		return count;// 返还计数器
	}
	
	public void travel() {
		Node tmp = head;// 临时引用先指向头节点
		while (tmp != null) {// 当遍历完节点后，tmp保存的是尾节点的next，其值为null
			System.out.println(tmp.value);// 打印引用指向节点的value
			tmp = tmp.next;// 回写下一个节点
		}
	}
	
	// 转换链表为数组
		public int[] toArray() {
			int[] arr = new int[size()];
			Node tmp = head;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = tmp.value;
				tmp = tmp.next;
			}
			return arr;
		}
	
	
}

public class NodeArray {

	public static void main(String[] args) {

	}
}
