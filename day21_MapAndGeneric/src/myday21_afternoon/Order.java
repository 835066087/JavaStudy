package myday21_afternoon;

import java.util.ArrayList;
import java.util.List;

//自定义泛型类
public class Order<T> {

	T t;
	int orderId;
	String orderName;

	public Order() {

	}

	public Order(T t) {
		this.t = t;
	}

	// 不是泛型方法
	public T show(T t) {
		System.out.println(t);
		return t;
	}

	// 泛型方法
	public <E> List<E> copyFromArrayToList(E[] arr) {
		ArrayList<E> list = new ArrayList<>();

		for (E t : arr) {
			list.add(t);
		}
		return list;
	}

}
