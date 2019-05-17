package myday08;

public class HomeWork3 {

//需求：把学生对象数组减半
	
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
		
		Student[] newStuArr =  new Student[stuArr.length / 2];//创造新数组,容量是老数组的一半
		for(int i = 0; i < newStuArr.length; i++) {
			newStuArr[i] = stuArr[i];//依次把老数组中需要的数据复制到新数组
		}
		stuArr = newStuArr;//老引用指向新数组
		
		for (Student tmp : stuArr) {//遍历打印
			System.out.println(tmp.say());
		}
		
	}
}
