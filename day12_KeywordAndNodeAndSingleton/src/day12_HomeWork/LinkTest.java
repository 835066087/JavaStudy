package day12_HomeWork;

class Node {

	int value;// 数值域
	Node next;// 指针域

}

class Link {
	private Node head = null;
	private Node tail = null;

	// 增加链表内容
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

	// 遍历链表
	public void travel() {
		Node tmp = head;// 临时引用先指向头节点
		while (tmp != null) {// 当遍历完节点后，tmp保存的是尾节点的next，其值为null
			System.out.println(tmp.value);// 打印引用指向节点的value
			tmp = tmp.next;// 回写下一个节点
		}
	}

	// 删除链表
	public void remove(int value) {
		Node pre = head;
		if (head.value == value) {// 条件判断，如果删除的是头
			head = head.next;// 把头赋值在头的下一个
		} else {
			while (pre.next != null) {// 如果pre不为最后一个
				if (pre.next.value == value) {
					break;
				}
				break;
			}
			pre.next = pre.next.next;
			if (pre.next == tail) {
				tail = pre;
			}
		}
	}

	// 获取有效元素的个数
	public int size() {// 通过计数器思想来完成
		Node tmp = head;// 从头开始遍历链表
		int count = 0;
		while (tmp != null) {// 当tmp为null时即遍历结束
			count++;// 每遍历一个数，计数一次
			tmp = tmp.next;// 迭代语句，让tmp等于tmp的下一个，最终让tmp归null
		}
		return count;// 返还计数器
	}

	// 获取指定位置的元素
	public int getValue(int index) {// 同样通过计数器思想来完成
		Node tmp = head;// 从头开始遍历
		int count = 0;
		int number = 0;// 用number接收返回值
		if (index > size() || index < 1) {// 进行条件判断，防止输入数字溢出
			System.out.println("数字输入错误");
		} else {

			while (tmp != null) {
				count++;
				if (index == count) {// 当脚标等于链表中的位置时
					number = tmp.value;// 赋值符合条件的value值到number
					System.out.println(number);
					break;
				} else {
					tmp = tmp.next;
				}
			}
		}
		return number;// 返还number
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

public class LinkTest {

	public static void main(String[] args) {

		Link link = new Link();
		link.add(100);
		link.add(200);
		link.add(300);
		link.add(300);
		link.add(300);
		link.add(300);

		link.getValue(3);// 调取任意数
		System.out.println(link.size());// 获取链表长度
		link.travel();// 遍历链表

		System.out.println("****************************************");
		int[] arr = link.toArray();// 将链表转换为数组
		for (int tmp : arr) {// 遍历打印
			System.out.println(tmp);
		}
	}

}
