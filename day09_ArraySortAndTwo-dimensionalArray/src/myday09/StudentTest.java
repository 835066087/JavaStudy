package myday09;

import myday09.Student;

public class StudentTest {

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
		
		System.out.println("**************************************");//分割线
	/*1	
		//冒泡排序
		for(int i = 0; i < stuArr.length - 1; i++) {
			for(int j = 0; j < stuArr.length - 1 - i; j++) {//比较的是j和j+1的位置的元素
				if(stuArr[j].getScore() > stuArr[j+1].getScore()) {
					Student tmp =  stuArr[j];
					stuArr[j] = stuArr[j+1];
					stuArr[j+1] = tmp;
				}
			}
		}
		//遍历打印
		for(Student tmp : stuArr) {
			System.out.println(tmp.say());
		}
		
		System.out.println("**************************************");//分割线*/
		
		//改进的选择排序
		for(int i = 0; i < stuArr.length - 1;i++) {
			int minIndex = i;
			for(int j = i + 1; j < stuArr.length;j++) {//内循环结束即赋值
				if(stuArr[j].getScore() < stuArr[minIndex].getScore()) {
					minIndex = j;
				}
			}
				Student tmp = stuArr[i];
				stuArr[i] = stuArr[minIndex];
				stuArr[minIndex] = tmp;

		}
		for(Student tmp : stuArr) {
			System.out.println(tmp.say());
		}
	}
}
