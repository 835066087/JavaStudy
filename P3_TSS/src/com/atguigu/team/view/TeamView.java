package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.CompanyService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;

public class TeamView {

	private CompanyService companyService = new CompanyService();
	private TeamService teamService = new TeamService();

	public void enterMainMenu() throws TeamException {
		boolean flag = true;

		do {
			System.out.println("------------------------------------开发团队调度软件系统---------------------------------");
			System.out.println();
			listAllEmployees();
			System.out.print("1 团队列表");
			System.out.print("\t2 添加团队成员");
			System.out.print("\t3 删除团队成员");
			System.out.print("\t4 退出");
			System.out.print("\t 请选择（1-4）：");
			char selection = TSUtility.readMenuSelection();
			switch (selection) {

			case '1':
				listTeam();
				break;

			case '2':
				addMember();
				break;

			case '3':
				deleteMember();
				break;

			case '4':
				System.out.print("确认是否退出（Y/N）：");
				char yon1 = TSUtility.readConfirmSelection();
				if (yon1 == 'Y') {
					flag = false;
				}

			}

		} while (flag == true);
	}

	public void listAllEmployees() {
		System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		Employee[] allEmployees = companyService.getAllEmployees();
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println(allEmployees[i]);
		}
	}

	private void addMember() {
		System.out.println("-----------------------------------添加团队成员-------------------------------------");

		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		// 获取员工，添加到团队中，从公司员工管理组件中获取
		// Employee tmp;
		try {
			Employee tmp = companyService.getEmployee(id);
			teamService.addMember(tmp);
			System.out.println("添加成功");
		} catch (TeamException e) {
			e.printStackTrace();
			System.out.println("添加失败");
		}
		TSUtility.readReturn();
	}

	private void deleteMember() {

		int tid = TSUtility.readInt();
		try {
			teamService.removeMember(tid);
			System.out.println("删除成功");
		} catch (TeamException e) {
			e.printStackTrace();
			System.out.println("删除失败");
		}
		TSUtility.readReturn();
	}

	private void listTeam() {
		System.out.println("团队成员列表");
		System.out.println();
		Programmer[] tmp = teamService.getTeam();
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i].toString2());
		}
		System.out.println("-----------------------------------------");
	}
}
