package interfacetest;

//定义一个用于创建对象的接口，让子类决定实例化哪一个类，factorymethod
//通过工厂，创建对象

interface Worker {
	public void work();
}

class Teacher implements Worker {
	public void work() {
		System.out.println("老师在工作");
	}
}

class Student implements Worker {
	public void work() {
		System.out.println("学生在工作");
	}
}

class Factory {

	public static Worker getTeacher() {
		return new Teacher();
	}

	public static Worker getStudent() {
		return new Student();
	}
}

public class FactoryMethod {

	public static void main(String[] args) {
		// 获取对象不用new，靠工厂方法

		Worker t1 = Factory.getTeacher();
		t1.work();

		Worker s1 = Factory.getStudent();
		s1.work();
	}
}
