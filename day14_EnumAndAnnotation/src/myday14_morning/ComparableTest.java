package myday14_morning;

class Student implements CompareObject {

	private int id;
	private String name;
	private int grade;
	private double score;

	public Student() {
	}

	public Student(int id, String name, int grade, double score) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			if (this.score == ((Student) o).score) {
				return 0;
			} else if (this.score > ((Student) o).score) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0x7FFFFFFF;
	}

}


public class ComparableTest {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "小明", 4, 70);
		Student s2 = new Student(2, "小丽", 3, 90);
		Student[] arr = new Student[5];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = new Student(3, "小花", 2, 100);
		arr[3] = new Student(4, "小光", 5, 20);
		arr[4] = new Student(5, "小芳", 1, 80);
		
		Sorter.sort(arr);
		
		// 遍历
		for (Student stu : arr) {
			System.out.println(stu);
		}
		
		System.out.println("*************");
		
		/*String[] strings = {"abc", "ABC", "111", "555", "ZZZ", "xxx", "qqq", "汉字"};
		Sorter.sort(strings);
		for (String s : strings) {
			System.out.println(s);
		}*/
	}
}
