package Afternoon;

//具体类：对现实世界某种事物的抽象定义
//抽象类，对现实世界某类不同种事物的统一抽象定义
public abstract class Pet {

	// 属性，构造器，普通方法，抽象方法
	private String name;
	private int age;
	private int weight;

	public Pet() {

	}

	public Pet(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public abstract void speak();// 抽象方法：只有方法签名，没有方法体
	
	public abstract void eat();//抽象方法

}
