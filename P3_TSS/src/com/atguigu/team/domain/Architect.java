package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Architect extends Designer {

	private int stock;

	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary, Status status, int memberId, double bonus,
			Equipment equipment, int stock) {
		super(id, name, age, salary, status, memberId, bonus, equipment);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t架构师" + "\t" + getStatus() + "\t"
				+ getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
	}

	@Override
	public String toString2() {
		return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t架构师" + "\t"
				+ getBonus() + "\t" + stock;
	}

}
