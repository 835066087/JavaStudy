package com.atguigu.team.service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.atguigu.team.domain.Item;

public class ItemService1 {

	public List<String> readTextFile(String filename) {
		
		FileReader fr = null;
		BufferedReader br = null;
		List<Item>list = new ArrayList<Item>();
		
		fr = new FileReader(filename);
		br = new BufferedReader(fr);
		
		for (int i = 0; i < 10; i++) {
			String line1 = br.readLine();
			String line2 = br.readLine();
			String line3 = br.readLine();
			String line4 = br.readLine();
			String line5 = br.readLine();
			String line6 = br.readLine();
			String line7 = br.readLine();
			Item item = new Item(line1,line2,line3,line4,line5,line6,line7.charAt(0));
			list.add(item);
		}
	}
}
