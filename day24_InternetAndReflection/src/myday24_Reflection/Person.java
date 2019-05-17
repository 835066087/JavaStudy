package myday24_Reflection;

public class Person {

	private String name;
	public int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();

	}

	private Person(String name) {
		super();
		this.name = name;
	}

	public void show() {

	}

	private void secret() {
		System.out.println("恭喜你发现秘密");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
