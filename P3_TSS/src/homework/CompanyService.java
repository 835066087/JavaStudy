package homework;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.Data;
import com.atguigu.team.service.Status;
import com.atguigu.team.service.TeamException;

public class CompanyService {

	private Employee[] employees;

	public CompanyService() {

		// 创建equipment数组
		Equipment[] equipments = new Equipment[Data.EQUIPMENTS.length];
		for (int i = 0; i < equipments.length; i++) {
			String[] child = Data.EQUIPMENTS[i];
			if (child.length == 0) {
				continue;
			}
			int code = Integer.parseInt(child[0]);
			if (code == 21) {
				equipments[i] = new PC(child[1], child[2]);
			} else if (code == 22) {
				equipments[i] = new NoteBook(child[1], Integer.parseInt(child[2]));
			} else if (Integer.parseInt(child[0]) == 23) {
				equipments[i] = new Printer(child[1], child[2]);
			}

		}
		//创建employee数组
		this.employees = new Employee[Data.EMPLOYEES.length];
		for (int i = 0; i < employees.length; i++) {
			String[] child = Data.EMPLOYEES[i];
			int code = Integer.parseInt(child[0]);
			int id = Integer.parseInt(child[1]);
			String name = child[2];
			int age = Integer.parseInt(child[3]);
			int salary = Integer.parseInt(child[4]);
			int bonus = Integer.parseInt(child[5]);
			int stock = Integer.parseInt(child[6]);

			if (code == 10) {
				employees[i] = new Employee(id, name, age, salary);
			} else if (code == 11) {
				employees[i] = new Programmer(id, name, age, salary, Status.FREE, 0, equipments[i]);
			} else if (code == 12) {
				employees[i] = new Designer(id, name, age, salary, Status.FREE, 0, bonus, equipments[i]);
			} else if (code == 13) {
				employees[i] = new Architect(id, name, age, salary, Status.FREE, 0, bonus, equipments[i], stock);
			}

		}
	}
	
	//获取所有成员
	public Employee[] getAllEmployees() {
		return employees;
	}
	//获取指定人员的信息
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		throw new TeamException("未找到id为" + id + "的职员");
	}

}
