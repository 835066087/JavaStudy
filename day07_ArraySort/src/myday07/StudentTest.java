package myday07;
/*
 *  写一个学生类, 属性id, name, grade, score
	要求: 创建一个对象数组, 保存20个学生对象
	学生对象的id号从1~20
	学生的姓名:某学生
	学生的年级是从1~6循环
	学生的分数10~100循环.
	遍历打印学生对象的详细信息
	遍历时只打印3年级的学生的详细信息
 */
public class StudentTest {
	
	public static void main(String[] args) {
		//设定属性，创建数组，此处未设定id，在随后用i替代
		Student[] stuArr = new Student[20];
		String name = "某学生";
		int grade = 1;
		double score = 10;
		int id = 0;
		String [] name1 = {"李","王","赵","钱","周","吴","郑","王"};
		String [] name2 = {"维","强","林","苞","明","闵","旻","雯"};
		for(int i = 0; i < stuArr.length; i++) 	{//制作循环
			 int randIndex1 = (int)(Math.random() * 100)% name1.length;
			 int randIndex2 = (int)(Math.random() * 100)% name2.length;	
			 name = name1[randIndex1] + name2[randIndex2];
			 grade = (int)(Math.random() * 6 + 1);
			 score = (int)(Math.random() * 101);
			 id = i + 1;
			stuArr[i] = new Student(name,grade,score);
										
		}
		for(Student tmp : stuArr) {
			//System.out.println(tmp.say());//遍历打印学生对象的详细信息
			System.out.println(tmp.say());
		}System.out.println();
		
		Student[] newStuArr = new Student[(int) (stuArr.length * 1.5)];
		for(int i = 0; i < stuArr.length;i++) {
			newStuArr[i] = stuArr[i];
		}
		stuArr = newStuArr;
		System.out.println(stuArr.length);
		
		//for(Student n : stuArr) {
			//System.out.println(n.say());
		//}
	}
	public static void main5(String[] args) {
		//设定属性，创建数组，此处未设定id，在随后用i替代
		Student[] stuArr = new Student[20];
		String name = "某学生";
		int grade = 1;
		double score = 10;
		int id = 0;
		String [] name1 = {"李","王","赵","钱","周","吴","郑","王"};
		String [] name2 = {"维","强","林","苞","明","闵","旻","雯"};
		for(int i = 0; i < stuArr.length; i++) 	{//制作循环
			 int randIndex1 = (int)(Math.random() * 100)% name1.length;
			 int randIndex2 = (int)(Math.random() * 100)% name2.length;	
			 name = name1[randIndex1] + name2[randIndex2];
			 grade = (int)(Math.random() * 6 + 1);
			 score = (int)(Math.random() * 101);
			 id = i + 1;
			stuArr[i] = new Student(name,grade,score);
										
		}
		for(Student tmp : stuArr) {
			//System.out.println(tmp.say());//遍历打印学生对象的详细信息
			System.out.println(tmp.say());
		}System.out.println();
		//找出全校最高分同学
		
		int maxIndex = 0;//利用脚标实现
		for(int i = 0 ; i < stuArr.length; i++) {
			if(stuArr[i].getScore() > stuArr[maxIndex].getScore()) {//依据脚标判断数值
				maxIndex = i;
			}
		}
		System.out.println("最高分:" + stuArr[maxIndex].say());
		
		int minIndex = 0;
		for(int i = 0; i < stuArr.length; i++) {
			if(stuArr[i].getScore() < stuArr[minIndex].getScore()) {
				minIndex = i;
			}
		}
		System.out.println("最低分："+stuArr[minIndex].say());
	}	 
	
	public static void main4(String[] args) {
		//设定属性，创建数组，此处未设定id，在随后用i替代
		Student[] stuArr = new Student[20];
		String name = "某学生";
		int grade = 1;
		double score = 10;
		int id = 0;
		String [] name1 = {"李","王","赵","钱","周","吴","郑","王"};
		String [] name2 = {"维","强","林","苞","明","闵","旻","雯"};
		for(int i = 0; i < stuArr.length; i++) 	{//制作循环
			 int randIndex1 = (int)(Math.random() * 100)% name1.length;
			 int randIndex2 = (int)(Math.random() * 100)% name2.length;	
			 name = name1[randIndex1] + name2[randIndex2];
			 grade = (int)(Math.random() * 6 + 1);
			 score = (int)(Math.random() * 101);
			 id = i + 1;
			stuArr[i] = new Student(name,grade,score);
										
		}
		for(Student tmp : stuArr) {
			//System.out.println(tmp.say());//遍历打印学生对象的详细信息
			System.out.println(tmp.say());
		}System.out.println();
		 
		
		double maxScore = 0x80000000; 
		for(int i = 0; i < stuArr.length;i++) {
			if( maxScore < stuArr[i].getScore() && stuArr[i].getGrade()  == 3) {
					maxScore = stuArr[i].getScore();
			}
		}
		if(maxScore == 0x80000000) {
			System.out.println("三年级中没有人参加本次考试");
		}else {
			System.out.println("三年级最高分为" + maxScore);
		}
		
		double minScore = 0x7FFFFFFF; 
		for(int i = 0; i < stuArr.length;i++) {
			if( minScore > stuArr[i].getScore() && stuArr[i].getGrade()  == 3) {
					minScore = stuArr[i].getScore();
			}
		}
		if(minScore == 0x7FFFFFFF) {
			System.out.println("三年级中没有人参加本次考试");
		}else {
			System.out.println("三年级最低分为" + minScore);
		}
		
		Student maxStudent = null;
		for(int i = 0 ; i < stuArr.length; i++) {
			if(stuArr[i].getGrade() == 3) {
				if(maxStudent == null) {//此处的用意在于判断出第一个3年级学生以后，给Null maxstudent赋值，因为如果不赋值，则会出现空指针错误
					maxStudent = stuArr[i];
				}else if(stuArr[i].getScore() > maxStudent.getScore()) { 
					maxStudent = stuArr[i];
				}   			
			}
		}
		if(maxStudent == null)  {
			System.out.println("没有三年级学生");
		}else {
		System.out.println("最强:" + maxStudent.say()); 
		}
		
		Student minStudent = null;
		for(int i = 0 ; i < stuArr.length; i++) {
			if(stuArr[i].getGrade() == 3) {
				if(minStudent == null) {
					minStudent = stuArr[i];
				}else if(stuArr[i].getScore() < minStudent.getScore()) {      
					minStudent = stuArr[i];
				}
			}	
		}if(minStudent == null)  {
			System.out.println("没有三年级学生");
		}else {
			System.out.println("最弱:" + minStudent.say()); 
		}

		
		
	}
		
	public static void main3(String[] args) {
		//设定属性，创建数组，此处未设定id，在随后用i替代
		Student[] stuArr = new Student[20];
		String name = "某学生";
		int grade = 1;
		double score = 10;
		int id = 0;
		String [] name1 = {"李","王","赵","钱","周","吴","郑","王"};
		String [] name2 = {"维","强","林","苞","明","闵","旻","雯"};
		for(int i = 0; i < stuArr.length; i++) 	{//制作循环
			 int randIndex1 = (int)(Math.random() * 100)% name1.length;
			 int randIndex2 = (int)(Math.random() * 100)% name2.length;	
			 name = name1[randIndex1] + name2[randIndex2];
			 grade = (int)(Math.random() * 6 + 1);
			 score = (int)(Math.random() * 101);
			 id = i + 1;
			stuArr[i] = new Student(name,grade,score);
										
		}
		for(Student tmp : stuArr) {
			//System.out.println(tmp.say());//遍历打印学生对象的详细信息
			System.out.print(tmp.getScore() + " ");
		}System.out.println();
		
		double max = stuArr[0].getScore();//假设第一个数为最大值
		for(int i = 0; i < stuArr.length; i++) {//循环找出最大值
			if(stuArr[i].getScore() > max ) {
				max = stuArr[i].getScore();
			}
		}
		System.out.println("最高分为" + max);
		//找出谁最高
		//找出谁最差
		
		double min = stuArr[0].getScore();//假设第一个数为最大值
		for(int i = 0; i < stuArr.length; i++) {//循环找出最大值
			if(stuArr[i].getScore() < min ) {
				min = stuArr[i].getScore();
			}
		}
		System.out.println("最低分为" + min);
		
		//找出谁最高
		//找出谁最差
		Student maxStudent = stuArr[0];
		for(int i = 0 ; i < stuArr.length; i++) {
			if(stuArr[i].getScore() > maxStudent.getScore() ) {      
			maxStudent = stuArr[i];        
		}   			
		}System.out.println("最强:" + maxStudent.say());                                      
		
		
		
	}
	
	
	public static void main2(String[] args) {
		//设定属性，创建数组，此处未设定id，在随后用i替代
		Student[] stuArr = new Student[20];
		String name = "某学生";
		int grade = 1;
		double score = 10;
		int id = 0;
		String [] name1 = {"李","王","赵","钱","周","吴","郑","王"};
		String [] name2 = {"维","强","林","苞","明","闵","旻","雯"};
		for(int i = 0; i < stuArr.length; i++) 	{//制作循环
			 int randIndex1 = (int)(Math.random() * 100)% name1.length;
			 int randIndex2 = (int)(Math.random() * 100)% name2.length;	
			 name = name1[randIndex1] + name2[randIndex2];
			 grade = (int)(Math.random() * 6 + 1);
			 score = (int)(Math.random() * 101);
			 id = i + 1;
			stuArr[i] = new Student(name,grade,score);
										
		}
		for(Student tmp : stuArr) {
			//System.out.println(tmp.say());//遍历打印学生对象的详细信息
			System.out.print(tmp.getScore() + " ");
		}System.out.println();
		
		//求三年级平均分
		int sum = 0;
		int count = 0;
		for(int i = 0; i < stuArr.length;i++) {
			if(stuArr[i].getGrade() == 3) {
				sum += stuArr[i].getScore();
				count++;
			}
		}
		if(count == 0) {
			System.out.println("没有三年级的同学");
		}else {
			System.out.println("sum:" + sum);
			int avg = sum/count;
			System.out.println("avg:" + avg);
		}
	}		
		
	
		//
		//年级随机产生【1~6年级】
		//分数随机产生[0~100】
	public static void main1(String[] args) {
		//设定属性，创建数组，此处未设定id，在随后用i替代
		Student[] stuArr = new Student[20];
		String name = "某学生";
		int grade = 1;
		double score = 10;
		int id = 0;
		String [] name1 = {"李","王","赵","钱","周","吴","郑","王"};
		String [] name2 = {"维","强","林","苞","明","闵","旻","雯"};
		for(int i = 0; i < stuArr.length; i++) 	{//制作循环
			 int randIndex1 = (int)(Math.random() * 100)% name1.length;
			 int randIndex2 = (int)(Math.random() * 100)% name2.length;	
			 name = name1[randIndex1] + name2[randIndex2];
			 grade = (int)(Math.random() * 6 + 1);
			 score = (int)(Math.random() * 101);
			 id = i + 1;
			stuArr[i] = new Student(name,grade,score);
										
		}
		
		for(Student tmp : stuArr) {
			//System.out.println(tmp.say());//遍历打印学生对象的详细信息
			System.out.print(tmp.getScore() + " ");
		}System.out.println();
		
		int sum = 0;
		for(int i = 0; i < stuArr.length; i++) {
			sum += (stuArr[i].getScore());
		
		}
		System.out.println("sum:" + sum);
		int avg = sum/ stuArr.length;
		System.out.println("avg:" + avg);
		
		
	}
	
}
