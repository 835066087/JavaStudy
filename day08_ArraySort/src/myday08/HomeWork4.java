package myday08;

public class HomeWork4 {
//需求，把三年级的同学都取到子数组中

	public static void main(String[] args) {
		Student[] stuArr = new Student[20];// 创建数组
		String name = "某学生";// 写入显式赋值
		int grade = 1;
		double score = 10;
		int id = 0;
		String[] name1 = { "李", "王", "赵", "钱", "周", "吴", "郑", "王" };// 利用随机数制造名字
		String[] name2 = { "维", "强", "林", "苞", "明", "闵", "旻", "雯" };
		for (int i = 0; i < stuArr.length; i++) {// 制作循环
			int randIndex1 = (int) (Math.random() * 100) % name1.length;
			int randIndex2 = (int) (Math.random() * 100) % name2.length;
			name = name1[randIndex1] + name2[randIndex2];
			grade = (int) (Math.random() * 6 + 1);// 年级在1-6之间产生
			score = (int) (Math.random() * 101);// 分数在0~100之间产生
			id = i + 1;
			stuArr[i] = new Student(id, name, grade, score);

		}

		for (Student tmp : stuArr) {
			System.out.println(tmp.say());// 遍历打印
		}
		System.out.println();

		System.out.println("**************************************");//分割线

		Student[] newStuArr = new Student[stuArr.length];// 创建足够大的数组
		int count = 0;
		for (int i = 0; i < stuArr.length; i++) {// 选出年级为三的同学填入newStuArr数组
			if (stuArr[i].getGrade() == 3) {
				newStuArr[count] = stuArr[i];
				count++;
			}
		}
		Student[] newStuArr1 = new Student[count];// 创建长度适合的数组

		for (int i = 0; i < newStuArr1.length; i++) {
			newStuArr1[i] = newStuArr[i];//为新数组赋值

		}

		for (Student tmp : newStuArr1) {//遍历打印新数组
			System.out.println(tmp.say());
		}

	}
}