package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Designer extends Programmer {

	private double bonus;

	public Designer() {
		super();
	}

	public Designer(int id, String name, int age, double salary, Status status, int memberId, double bonus,
			Equipment equipment) {
		super(id, name, age, salary, status, memberId, equipment);
		this.bonus = bonus;

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t设计师" + "\t" + getStatus() + "\t"
				+ bonus + "\t\t" + getEquipment().getDescription();
	}

	@Override
	public String toString2() {
		return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t设计师" + "\t"
				+ bonus;
	}

}
