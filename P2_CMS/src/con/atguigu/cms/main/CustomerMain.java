package con.atguigu.cms.main;

import com.atguigu.cms.domain.Customer;
import com.atguigu.service.CustomerList;
import com.atuguigu.cms.view.CustomerView;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
		/*Customer cust1 = new Customer("张一",'男',40,"1328902817","32312312@qq.com");
		Customer cust2 = new Customer("张二", '女', 20, "134324234", "zhang2@qq.com");
		Customer cust3 = new Customer("张三", '男', 30, "134324234", "zhang3@qq.com");
		Customer cust4 = new Customer("张四", '女', 40, "134324234", "zhang4@qq.com");
		Customer cust5 = new Customer("张五", '男', 50, "134324234", "zhang5@qq.com");
		Customer cust6 = new Customer("张六", '女', 60, "134324234", "zhang6@qq.com");
		Customer cust7 = new Customer("张七", '男', 70, "134324234", "zhang7@qq.com");
		
		System.out.println(cust1.say());
		System.out.println(cust2.say());
		System.out.println(cust3.say());
		System.out.println(cust4.say());
		System.out.println(cust5.say());
		System.out.println(cust6.say());
		System.out.println(cust7.say());*/
		
		//Customer[] arr = new Customer[10];
	/*	CustomerList customerList = new CustomerList(8); // 参数8的作用是告诉管理模块创建数组容量为8
		boolean b1 = customerList.addCustomer(cust1);
		boolean b2 = customerList.addCustomer(cust2);
		boolean b3 = customerList.addCustomer(cust3);
		boolean b4 = customerList.addCustomer(cust4);
		boolean b5 = customerList.addCustomer(cust5);
		boolean b6 = customerList.addCustomer(cust6);
		//boolean b7 = customerList.addCustomer(cust7);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		//System.out.println(b7);*/
		
		/*
		Customer[] array = customerList.getCustomers(); // 数组有空洞
		//System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println(array[i].say());
			} else {
				System.out.println(array[i]);
			}
		}*/
	/*	System.out.println("***************************");

		Customer tmp = customerList.getCustomer(-10);
		if(tmp == null) {
			System.out.println("输入错误");
		}else {
		System.out.println(tmp.say());
		}
		
		System.out.println("**************************");
		
		customerList.deleteCustomer(-100);
		
		
		Customer[] arr2 = customerList.getAllCustomers();
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].say());
		}
	}

		
	}	*/
		

