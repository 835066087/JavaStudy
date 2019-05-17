package morning;

public class Employee {
	//静态属性，称为类属性，类属性是斜体,类属性存储在类模板中
	public static String company = "atguigu";
	public static int num = 1;
	private static Employee emp;
	
	//静态方法，也称为类方法
	public static void test() {
		System.out.println(company);//类方法可以直接访问类属性
	}
	
	//静态的都放在最上面，隶属于类
	//构造器非静态，因为他的目的是创建对象
	
	public static void test2() {
		//在静态环境中不可以直接访问非静态成员
		//在静态环境中间接访问非静态成员，通过创建对象来访问
		emp = new Employee();
		emp.age = 10;
		emp.name = "小王";
		emp.salary = 1000;
		
	}
	
	private int age;
	private String name;
	private double salary;
	private final int ID;//空final量，应该尽快被赋值
	
	
	
	public Employee(int age, String name, double salary) {
		super();
		company = "ATGUIGU";//非静态环境可以直接访问静态成员
		this.ID = num++;//可以实现id自动生成的效果
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		this.ID = num++;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employ id: " + ID +  ",name: " + name + ",age: " + age + ",salary:" + salary;
	}
}
