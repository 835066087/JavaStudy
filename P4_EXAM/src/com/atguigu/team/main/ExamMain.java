package com.atguigu.team.main;

import com.atguigu.team.service.ItemService;

public class ExamMain {
	
	public static void main(String[] args) {
		ItemService it = new ItemService();
		it.readTextFile("/Users/liuyuanjie/eclipse-workspace/P4_EXAM/“Items”的副本.txt");
		
	}
}
