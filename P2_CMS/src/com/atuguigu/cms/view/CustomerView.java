package com.atuguigu.cms.view;

import com.atguigu.cms.domain.Customer;
import com.atguigu.service.CustomerList;
//Ui模块，负责和用户的请求，把用户的请求转化为服务组件的方法调用
public class CustomerView {
	//对象关联服务组件
	CustomerList custList = new CustomerList(10);//10表示最多管理10个客户
	
	public void enterMainMenu() {
		boolean loop = true;
		do{//死循环
			System.out.println("------------------------------------客户信息管理系统---------------------------------");
			System.out.println();
			System.out.println("\t\t\t1 添加客户");
			System.out.println("\t\t\t2 修改客户");
			System.out.println("\t\t\t3 删除客户");
			System.out.println("\t\t\t4 客户列表");
			System.out.println("\t\t\t5 退   出");
			System.out.println();
			System.out.print("\t\t\t请选择（1-5）：");
				
			char n1 = CMUtility.readMenuSelection();
			
		  	// 如果'1' 调用 addNewCustomer()
		    // 如果'2' 调用 modifyCustomer()
	        // 如果'3' 调用 deleteCustomer()
	        // 如果'4' 调用 listAllCustomers()
	        // 如果'5' 修改循环布尔为false

			switch(n1) {
				case '1' :
					addNewCustomer();
					break;
				case '2' :
					modifyCustomer();		
					break;
				case '3' :
					deleteCustomer();
					break;
				case '4' :
					listAllCustomer();
					break;
				case '5' :
					System.out.print("确认是否退出（Y/N）：" );
					char n2 = CMUtility.readConfirmSelection();
					if(n2 == 'Y'){	
						loop = false;
					}
					break;	
			}
		
		
		}while(loop == true);
	}
	
	private void addNewCustomer() {
		System.out.println("-------------------------------------添加客户---------------------------------------");
		System.out.println();
		
		System.out.print("请输入客户姓名：");
		String name = CMUtility.readString(16);
		
		System.out.print("请输入客户性别：");
		char gender = CMUtility.readChar();
		
		System.out.print("请输入客户年龄：");
		int age = CMUtility.readInt();
		
		System.out.print("请输入客户手机（11位）：");
		String phone = CMUtility.readString(11);
		
		System.out.print("请输入客户邮箱：");
		String email = CMUtility.readString(30);
		
		//
		Customer customer = new Customer(name,gender,age,phone,email);		
		
		boolean flag = custList.addCustomer(customer);//调用管理方法
	if(flag  == false) {
		System.out.println("---------------------------------操作失败，内存已满-----------------------------------");
	}else {
		System.out.println("-------------------------------------操作成功---------------------------------------");
	}
	}
	
	private void modifyCustomer() {
		System.out.print("请选择待修改客户编号（-1退出）:");
		int number2 = CMUtility.readInt();
		if(number2 < -1 || number2 > custList.getAllCustomers().length ) {
			System.out.println("输入错误，请重新输入");
			return;
		}
		if (number2 == -1) {
			return;
		}
		number2 -= 1;
		
		Customer[] custs = custList.getAllCustomers();
		
		System.out.print("姓名(" + custs[number2].getName() + ")"+"<直接回车表示不修改>:");
		String defaultValueN = custs[number2].getName();//可优化为直接将custs[number2].getName()直接带入defaultValueN中，简化
		String m1 = CMUtility.readString(16, defaultValueN);
		custs[number2].setName(m1);
		
		System.out.print("性别(" + custs[number2].getGender() + "):");
		char defaultValueG = custs[number2].getGender();
		char m4 = CMUtility.readChar(defaultValueG );
		custs[number2].setGender(m4);
		
		System.out.print("年龄(" + custs[number2].getAge() + "):");
		int defaultValueA = custs[number2].getAge();
		int m5 = CMUtility.readInt(defaultValueA );
		custs[number2].setAge(m5);
		
		System.out.print("电话(" + custs[number2].getPhone() + "):");
		String defaultValueP = custs[number2].getPhone();
		String m2 = CMUtility.readString(11, defaultValueP);
		custs[number2].setPhone(m2);
		
		System.out.print("邮箱(" + custs[number2].getEmail() + "):");
		String defaultValueE = custs[number2].getEmail();
		String m3 = CMUtility.readString(30, defaultValueE);
		custs[number2].setEmail(m3);
		
	}
	
	private void deleteCustomer() {
		System.out.println("-------------------------------------删除客户---------------------------------------");
		System.out.println();
		System.out.print("请选择删除客户编号（-1退出）:");
		int number = CMUtility.readInt();
		//if(number - 1 < -1 || number - 1 > custList.getAllCustomers().length ) {
		//	System.out.println("输入错误，请重新输入");
		//	return;
		//}
		if (number == -1) {
			return;
		}
		System.out.print("确认是否删除（Y/N）：" );
		char n3 = CMUtility.readConfirmSelection();
		if(n3 == 'Y'){	
			boolean flag = custList.deleteCustomer(number - 1);
			if(flag) {
			System.out.println("-------------------------------------删除完成---------------------------------------");
		}else {
			System.out.println("-------------------------------------删除失败---------------------------------------");
			return;
		}
		}
		
		
	}
	
	private void listAllCustomer() {
		System.out.println("-------------------------------------成员列表---------------------------------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		Customer[] custs = custList.getAllCustomers();
		for(int i = 0; i < custList.getAllCustomers().length;i++) {
			if(custs[i] != null) {
			System.out.println((i + 1) + "\t" + custs[i].say());
			}else {
				System.out.println("---------------------------------当前数据库中无内容----------------------------------");
				System.out.println();
			}
			
		}
	}
	
	
}
