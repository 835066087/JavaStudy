package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add("world");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {

			String next = iterator.next();
			if ("java".equals(next)) {
				iterator.remove();
			}
		}

		for (String string : list) {
			System.out.println(string);
		}
	}
}
