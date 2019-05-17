package StreamAPI;



import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import Method_reference.Employee;
import Method_reference.EmployeeData;

public class StramAPIMiddle {

	@Test
	public void test1() {
		
		List<Employee> employees = EmployeeData.getEmployees();
		
		Stream<Employee> stream1 = employees.stream();
		
		stream1.filter(emp -> emp.getSalary() > 6000).forEach(System.out::print);

		//一旦执行终止操作，就不可以执行其他操作
//		stream1.limit(4).forEach(System.out::print);
	}
	
}
