package morning;

public class Bird extends Pet {

	private int flySpeed;

	public Bird() {

	}

	public Bird(String name, int age, int weight, int flySpeed) {
		super(name, age, weight);
		this.flySpeed = flySpeed;
	}

	public int getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(int flySpeed) {
		this.flySpeed = flySpeed;
	}


	
	@Override
	public String toString() {
		return super.toString() + "，Bird [flySpeed=" + flySpeed + "]";
	}

	@Override
	public void eat() {//实现 implement,有方法体就叫实现
		System.out.println("早起的虫子被鸟吃");
	}
	
	@Override
	public void speak() {
		System.out.println("吱吱");
	}

}
