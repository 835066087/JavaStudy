package day28_JDBC_javabean;

import java.sql.Date;

/*
 * 体会ORM编程思想：
 * 一个数据表与一个java类对应
 * 表中的一个字段与java类的属性对应
 * 表中的一条记录与java类的一个对象对应
 */

public class Customer {

	private int id;
	private String name;
	private String email;
	private Date birth;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String email, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", birth=" + birth + "]";
	}

}
