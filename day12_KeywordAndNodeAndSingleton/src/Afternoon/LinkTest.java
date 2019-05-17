package Afternoon;

class Node {

	int value;// 数据域
	Node next;// 指针域
}

class Link {
	private Node head = null;// 头节点引用重要
	private Node tail = null;

	//增加链表内容
	public void add(int value) {
		Node newNode = new Node();
		newNode.value = value;
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			// 让老尾节点的next指针指向新节点，新节点赋值于tail.next
			tail.next = newNode;
			// 更新尾节点为最新的节点
			tail = newNode;
		}
	}

	// 遍历链表
	public void travel() {// 先头后尾
		Node tmp = head;// 临时引用先指向头节点
		while (tmp != null) {// 当遍历完节点后，tmp保存的是尾节点的next，其为null
			System.out.println(tmp.value);// 打印引用指向节点的value
			tmp = tmp.next;// 回写下一个节点
		}
	}

	// 删除链表
	public void remove(int value) {
		Node pre = head;
		if (head.value == value) {// 如果删除的为头
			head = head.next;// 把头赋值在头的下一个
		} else {
			while (pre.next != null) {
				if (pre.next.value == value) {//前一个节点的下一个
					break;
				}
			}
			pre.next = pre.next.next;
			if (pre.next == tail) {
				tail = pre;
			}
		}
	}

	// 获取有效元素个数
	public int size() {
		Node tmp = head;
		int count = 0;
		while (tmp != null) {
			count++;
		}
		System.out.println(count);
		return count;
	}

	// 获取指定位置的元素
	//public int getValue(int index) {
	//	Node  = head;
		
		
		
	//}

	// 转换链表为数组
	//public int[] toArray() {
	//	Node tmp = head;
	//	int count = 0;
	//	while (tmp != null) {
	//		count++;
	//	}
	//	int[] arr = new int[count];
	//	travel();
		
//	}

}

public class LinkTest {

	public static void main(String[] args) {
		Link link = new Link();
		link.add(100);
		link.add(200);
		link.add(300);
		link.add(400);
		link.add(500);
		link.add(600);

		//link.travel();
		//link.size();
		link.remove(1);
		link.travel();
		
	}

}
