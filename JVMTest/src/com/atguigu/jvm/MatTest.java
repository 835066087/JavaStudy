package com.atguigu.jvm;

import java.util.ArrayList;
import java.util.List;

public class MatTest {
	
	byte[] byteArray = new byte[1*1024*1024];//1MB

	public static void main(String[] args) {
		List<MatTest>list = new ArrayList<MatTest>();
		
		int count = 0;
		
		try {
			while(true) 
			{
				list.add(new MatTest());
				count = count + 1;
			}
			
		} catch (Throwable e) {
			System.out.println("*********count="+count);
			e.printStackTrace();
		}
		
	}

}
