package myday14_afternoon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 
 * @Override 注解只能用在方法上
 * 
 * @Deprecated 注解可以使用在类上，属性上，方法上，构造器上，局部变量上，不能用于包
 * 作用是它所修饰的目标已过时

 * @SuppressWarnings({"unused","null"})，作用是抑制编译器警告
 * 
 * @Retention规定此注解可以停留在什么时候，有三个层次，
 * 第一个层次是SOURECE，只停留在源文件中，生成的类文件没有，
 * 第二个层次是CLASS，可以停留在类文件中，但是不能反射处理
 * 第三个层次是RUNTIME，不仅可以停留在类中，也可以在运行时，用反射的方式
 * 
 * @Target({ElementType.METHOD,ElementType.TYPE})//限制此注解可以使用的地方
 * 
 * 自定义注解,可以使用在除了包以外的任意位置
 * 如果没有使用元注解对其约束，它可以使用范围比较大
 * 
 */

@interface Myannotation {// 如果注解有属性，则在使用时必须传递值

	String name() default "abc";// 属性的声明，像方法，本质上就是方法

	int age() default 100;
}

@Target({ElementType.METHOD,ElementType.TYPE})//限制此注解可以使用的地方
@Retention(RetentionPolicy.RUNTIME)
@interface HelloAnnotation {
	String value() default "不知道";

	int id() default 10;
}

@HelloAnnotation
class Test {
	private int i;
	private double q;

	@HelloAnnotation
	public int getI() {
		return i;
	}
	@HelloAnnotation
	public void setI(int i) {
		this.i = i;
	}

	public double getQ() {
		return q;
	}
	@HelloAnnotation
	public void setQ(double q) {
		this.q = q;
	}

	public Test(int i, double q) {
		super();
		this.i = i;
		this.q = q;
	}
	
	public void TestAnnotation() {
		int i = 0;
		System.out.println("注解测试");
	}

}

@Deprecated
public class Teacher {

	@SuppressWarnings("unused")
	@Deprecated
	private String name;
	@SuppressWarnings("unused")
	private int age;
	@SuppressWarnings("unused")
	private String gender;

	@Deprecated
	public Teacher() {

	}

	@SuppressWarnings("unused")
	public Teacher(@Deprecated String name, int age, String gender) {
		super();
		int n = 10;
		int[] arr = null;
	}

}
