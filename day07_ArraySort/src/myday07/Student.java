package myday07;

public class Student {
	private String name;
	private int grade;
	private double score;
	
	public Student() {
		
	}
	
	public Student(String name,int grade,double score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
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
	
	public String say() {
		String str = "我叫" + name +"我在读"+ grade + "年级,我这次考了" + score + "分";
		return str;
	}
}
