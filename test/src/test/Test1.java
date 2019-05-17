package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		Integer[] datas = {1,2,3,4,5};
		
		List<Integer> list = Arrays.asList(datas);
		list.set(0, 100);
		//list.add(5);
		//System.out.println(list.size());
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}

}
