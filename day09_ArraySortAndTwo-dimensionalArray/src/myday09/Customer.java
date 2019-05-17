package myday09;



public class Customer {

	private String name;
	private int grade;
	private double score;
	private int id;
	
	
	public Customer(int id, String name,int grade,double score) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int grade) {
		this.grade = grade;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public double getScore() {
		return score;
	}
	
	public int getId() {
		return id;
	}
	
	public String say() {
		String str ="id" + id + ",姓名：" + name + ",年级："+ grade + ",分数：" + score + "分";
		return str;
	}
	
}
