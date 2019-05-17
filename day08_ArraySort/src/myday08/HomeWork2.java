package myday08;

import myday08.Student;

//使用下标的方式, 找出3年级的最高分同学和最低分同学

public class HomeWork2 {

	public static void main(String[] args) {
		Student[] stuArr = new Student[20];//创建数组
		String name = "某学生";//写入显式赋值
		int grade = 1;
		double score = 10;
		int id = 0;
		String [] name1 = {"李","王","赵","钱","周","吴","郑","王"};//利用随机数制造名字
		String [] name2 = {"维","强","林","苞","明","闵","旻","雯"};
		for(int i = 0; i < stuArr.length; i++) 	{//制作循环
			 int randIndex1 = (int)(Math.random() * 100)% name1.length;
			 int randIndex2 = (int)(Math.random() * 100)% name2.length;	
			 name = name1[randIndex1] + name2[randIndex2];
			 grade = (int)(Math.random() * 6 + 1);//年级在1-6之间产生
			 score = (int)(Math.random() * 101);//分数在0~100之间产生
			 id = i + 1;
			 stuArr[i] = new Student(id,name,grade,score);
										
		}
		
		for(Student tmp : stuArr) {
			System.out.println(tmp.say());//遍历打印
		}System.out.println();
		
		int maxIndex = -1;//开始测定三年级最高分
		for (int i = 0; i < stuArr.length; i++) {
			if(stuArr[i].getGrade() == 3) {
				if(maxIndex == -1) {//判断是否仍是-1，防止超出范围
					maxIndex = i;
				}else if(stuArr[i].getScore() > stuArr[maxIndex].getScore()) {
						maxIndex = i;
				}
			}
		}
		if(maxIndex == -1) {
			System.out.println("没有三年级的同学");
		}else {
			System.out.println("三年级最高分为：" + stuArr[maxIndex].say());
		}
		
		
		int minIndex = -1;//开始测定三年级最低分
		for (int i = 0; i < stuArr.length; i++) {
			if(stuArr[i].getGrade() == 3) {
				if(minIndex == -1) {//判断是否仍是-1，防止超出范围
					minIndex = i;
				}else if(stuArr[i].getScore() < stuArr[minIndex].getScore()) {
						minIndex = i;
				}
			}
		}
		if(minIndex == -1) {
			System.out.println("没有三年级的同学");
		}else {
			System.out.println("三年级最低分为：" + stuArr[minIndex].say());
		}
	}
	
}
