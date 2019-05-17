package com.atguigu.service;

import com.atguigu.cms.domain.Customer;

public class CustomerList {
	
	//关联数组，便于在本类中的任意方法中直接使用它
	private Customer[] customers;//用来保存客户对象的数组
	private int realCount = 0;//记录已保存的客户对象的数量

	//public void setRealCount(int realCount) {//防止外部篡改
	//	this.realCount = realCount;
	//}
	
	//public int getRealCount() {
	//	return realCount;
	//}
	
	//public void setCustomers(Customer[] customers) {//防止外部篡改数据
	//	this.customers = customers;
	//}

	//public Customer[] getCustomers() {
	//	return customers;
	//}

	//构造器是用于指定数组的初始容量
	public CustomerList(int totalCount) {
		//创建数组对象
		this.customers = new Customer[totalCount];
	}
	/*
		用途：将参数customer添加组中最后一个客户对象记录之后
		参数：customer指定要添加的客户对象 
		返回：添加成功返回true；false表示数组已满，无法添加
		@param customer
		@return 布尔
		
	*/
	public boolean addCustomer(Customer customer) {//实现添加功能
		//先做判断，如果数组已满，就不能添加新元素，返回false
		//对象如何插到数组中,插入到计数器的当前值
		if(realCount == this.customers.length) {
			return false;
		}
			this.customers[realCount] =  customer;
			//调整计数器
			realCount++;
			return true;
		}

	
	public Customer[] getAllCustomers() {//实现获取所有数组内容的功能
		Customer[] tmp = new Customer[realCount];
		for(int i = 0; i < realCount; i++) {
			tmp[i] = this.customers[i];			//完美数组，以便于可以say出
		}
		return tmp;
		//新建一个数组，长度是realCount的长度
		//依次把内部数组中的元素复制到新数组中
		//发布回这个新数组，新数组即完美数组
	}
	
	public  Customer getCustomer(int index) {
		if(index < 0 || index > realCount) {
			return null;
		}
		return customers[index];
	}
	
	public boolean deleteCustomer(int index) {
		if(index < 0 || index > realCount) {
			System.out.println("输入错误");
			return false;
		}
		customers[index] = null;//可省略
		//把所有要删除的下标位置处置为空洞
		//从要删除的下标位置处开始，依次把后面所有有效元素移到左边
		for(int i = index; i < realCount - 1 ; i++) {
			customers[i] = customers[i+1];
			customers[realCount - 1] = null;
			realCount --;			
		}
		//把之前的最后一个有效元素位置处置为空洞
		//调整计数器
		return true;
		
	}
}
