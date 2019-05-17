package morning;

public class Dog extends Pet {

	private String variety;

	public Dog() {
		super();
	}

	public Dog(String name, int age, int weight, String variety) {
		super(name, age, weight);
		this.variety = variety;

	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	@Override
	public String toString() {
		return super.toString() + "，Dog [variety=" + variety + "]";
	}

	@Override
	public void speak() {
		System.out.println("风在吼，狗在叫");		
	}

	@Override
	public void eat() {
		System.out.println("狗也在吃东西");
		
	}
	
	

}
