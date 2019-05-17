package com.atguigu.team.main;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.CompanyService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.view.TeamView;

public class TeamMain {
		public static void main(String[] args) throws TeamException {
			TeamView view = new TeamView();
			view.enterMainMenu();
		}

	
	
	
	
	
	
	
	/*public static void main(String[] args) { 
		CompanyService companyService = new CompanyService();
		try {
			Employee employee = companyService.getEmployee(1);
			System.out.println(employee);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
		Employee[] allEmployees = companyService.getAllEmployees();
		
		for (int i = 0; i < allEmployees.length; i++) {
		System.out.println(allEmployees[i]);
		}
	}*/
}
