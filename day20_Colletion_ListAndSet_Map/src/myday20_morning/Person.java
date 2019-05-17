package myday20_morning;

public class Person implements Comparable {

	public String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {// return age + name.hashCode()
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals().....");
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
			
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Person){
			Person p = (Person)o;
			
			int value = -(this.age - p.age);//通过在此步加减符号来形成正序或者倒序
			//int value = this.age - p.age;//通过在此步加减符号来形成正序或者倒序
			if(value != 0){
				return value;
			}else{
				return this.name.compareTo(p.name);
			}
			
		}else{
			throw new RuntimeException("输入的类型不一致");
		}
	}

}
