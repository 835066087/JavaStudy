package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

public class CompanyService {

	private Employee[] employees;

	public CompanyService() {

		Equipment[] equipments = new Equipment[Data.EQUIPMENTS.length];
		for (int i = 0; i < equipments.length; i++) {
			String[] child = Data.EQUIPMENTS[i];
			if (child.length == 0) {
				continue;
			}
			// 取下标为0的元素，转换为整数，把它保存为识别码
			// if(child[0] != null) {
			if (Integer.parseInt(child[0]) == 21) {
				equipments[i] = new PC(child[1], child[2]);
			} else if (Integer.parseInt(child[0]) == 22) {
				equipments[i] = new NoteBook(child[1], Integer.parseInt(child[2]));
			} else if (Integer.parseInt(child[0]) == 23) {
				equipments[i] = new Printer(child[1], child[2]);
			} else {
				continue;
			}
		}

		this.employees = new Employee[Data.EMPLOYEES.length];
		for (int i = 0; i < employees.length; i++) {
			String[] child = Data.EMPLOYEES[i];

			if (Integer.parseInt(child[0]) == 10) {
				employees[i] = new Employee(Integer.parseInt(child[1]), child[2], Integer.parseInt(child[3]),
						Integer.parseInt(child[4]));
			} else if (Integer.parseInt(child[0]) == 11) {
				employees[i] = new Programmer(Integer.parseInt(child[1]), child[2], Integer.parseInt(child[3]),
						Integer.parseInt(child[4]), Status.FREE, 0, equipments[i]);
			} else if (Integer.parseInt(child[0]) == 12) {
				employees[i] = new Designer(Integer.parseInt(child[1]), child[2], Integer.parseInt(child[3]),
						Integer.parseInt(child[4]), Status.FREE, 0, Integer.parseInt(child[5]), equipments[i]);
			} else if (Integer.parseInt(child[0]) == 13) {
				employees[i] = new Architect(Integer.parseInt(child[1]), child[2], Integer.parseInt(child[3]),
						Integer.parseInt(child[4]), Status.FREE, 0, Integer.parseInt(child[5]), equipments[i],
						Integer.parseInt(child[6]));
			}
		}

	}

	public Employee[] getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) throws TeamException {
		//遍历对象数组，如果对象的ID属性等于参数中的ID值，返回对象
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == id) {
				return employees[i];
			}
		}
		throw new TeamException("未找到id为" + id + "的职员");
		//若无找到对象，抛出异常
	}

}
