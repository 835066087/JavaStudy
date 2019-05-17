package myday23_afternoon;

import java.io.Serializable;

/*
 * Person类实现序列化的要求
 * 1.实现Serializable； 
 * 2.提供序列版本号，serialVersionUID，唯一的识别类
 * 3.要求类的所有属性都必须是可序列化的
 * 		特别的：String、8种基本数据类型本身已经是可序列化的了
 * 
 * 说明：不能序列化static和transient修饰的成员变量
 */

public class Person implements Serializable {

	private static final long serialVersionUID = -6464466L;

	private int age;
	private String name;

	public Person() {
		super();
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
