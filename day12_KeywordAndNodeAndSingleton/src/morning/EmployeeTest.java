package morning;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee.test();
		Employee.company = "尚硅谷";
		Employee.test();
		Employee e1 = new Employee(18,"小张",2000);
		Employee e2 = new Employee(18,"小张",2000);
		Employee e3 = new Employee(18,"小张",2000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
}
