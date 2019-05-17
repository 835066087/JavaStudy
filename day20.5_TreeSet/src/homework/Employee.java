package homework;

public class Employee implements Comparable {

	private String name;
	private int age;

	Mydate birthday = new Mydate();

	public Employee() {
		super();
	}

	public Employee(String name, int age, Mydate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
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

	public Mydate getBirthday() {
		return birthday;
	}

	public void setBirthday(Mydate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ", 年龄：" + age + ", 生日：" + birthday;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Employee) {
			Employee e = (Employee) o;

			return this.getName().compareTo(e.getName());
		} else {
			throw new RuntimeException("传入的类型不匹配");
		}

	}
}
