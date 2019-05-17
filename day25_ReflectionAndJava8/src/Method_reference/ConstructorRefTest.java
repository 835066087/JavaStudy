package Method_reference;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *
 * 二、数组引用
 *
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
    	Supplier<Employee> sup = new Supplier<Employee>() {

			@Override
			public Employee get() {
				return new Employee();
			}
    		
    	};
    	
    	Supplier<Employee> sup1 = () -> new Employee();
    	
    	Supplier<Employee> sup2 = Employee::new;
    	
    	
	}

	//Function中的R apply(T t)
    @Test
    public void test2(){
    	Function<Integer,Employee> func = id -> new Employee(id);
    	
    	Function<Integer,Employee> func1 = Employee::new;
	}

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
    	BiFunction<Integer,String,Employee> biFunc = (id,name) -> new Employee();
    	
    	BiFunction<Integer,String,Employee> biFunc1 = Employee::new;
    	
	}

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){

	}
}
