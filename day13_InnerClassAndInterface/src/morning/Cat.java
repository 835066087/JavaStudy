package morning;

public class Cat extends Pet{

	private String color;

	public Cat() {
		super();

	}

	public Cat(String name, int age, int weight, String color) {
		super(name,age,weight);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "，Cat [color=" + color + "]";
	}

	@Override
	public void speak() {
		System.out.println("喵喵喵");
		
	}

	@Override
	public void eat() {
		System.out.println("猫在吃东西");
		
	}
	
	
	
	
	

}
