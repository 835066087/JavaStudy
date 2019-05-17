package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Programmer extends Employee {

	private int memberId;// 团队ID
	private Status status;
	private Equipment equipment;

	public int getMemberId() {
		return memberId;
	}

	public Programmer() {
		super();

	}

	public Programmer(int id, String name, int age, double salary, Status status, int memberId, Equipment equipment) {
		super(id, name, age, salary);
		this.memberId = memberId;
		this.status = status;
		this.equipment = equipment;

	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + "\t程序员"  + "\t" + status + "\t\t\t" + equipment.getDescription();
	}
	
	public String toString2() {
		return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员";
	}

}
