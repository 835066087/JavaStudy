package com.atguigu.cms.view;

import com.atguigu.cms.domain.Book;
import com.atguigu.cms.view.BMUtility;
import com.atguigu.service.BookList;

public class BookView {
	
	//对象关联服务组件
	BookList bookList = new BookList(2);
	
	//进入主菜单
	public void enterMainMenu() {
		boolean loop = true;
		
		//开始执行主要循环
		do {
			System.out.println("------------------------------------图书信息管理系统---------------------------------");
			System.out.println();
			System.out.println("\t\t\t1 添加图书");
			System.out.println("\t\t\t2 增加系统存储上限");
			System.out.println("\t\t\t3 修改图书");
			System.out.println("\t\t\t4 删除图书");
			System.out.println("\t\t\t5 图书列表");
			System.out.println("\t\t\t6 退   出");
			System.out.println();
			System.out.print("\t\t\t请选择（1-6）：");
		//增加新选项，通过修改BMUtility来使6不报错
			char yon = BMUtility.readMenuSelection();
			
			switch(yon) {
			case '1' :
				addNewBook();
			  	// 如果'1' 调用 addNewBook()
				break;
			case '2' :
				addMaxBook();
			  	// 如果'2' 调用 addMaxBook()
				break;
			case '3' :
				modifyBook();
				// 如果'3' 调用 modifyBook()
				break;
			case '4' :
				deleteBook();
				// 如果'4' 调用 deleteBook()	
				break;
			case '5' :
				listBook();
				// 如果'5' 调用 listBook()
				break;
			case '6' :
				System.out.print("确认是否退出（Y/N）：" );
				char yon1 = BMUtility.readConfirmSelection();
				if(yon1 == 'Y'){	
					loop = false;
				}
				break;
			}
		
		}while(loop == true);
	}
	//创建第一个功能，引用List中的addNewBook方法
	private void addNewBook(){
		System.out.println("-------------------------------------添加图书---------------------------------------");
		System.out.println();
		
		System.out.print("请输入书籍名称：");
		String name = BMUtility.readString(100);
		
		System.out.print("请输入书籍作者：");
		String author = BMUtility.readString(100);
		
		System.out.print("请输入书籍售价：");
		int price = BMUtility.readInt();
		
		System.out.print("请输入书籍存量：");
		int stock = BMUtility.readInt();
		
		System.out.print("请输入书籍销量：");
		int sales  = BMUtility.readInt();
		
		Book books = new Book(name,author,price,stock,sales);
		bookList.addNewBook(books);

			System.out.println("-------------------------------------操作成功---------------------------------------");
		
	}
	//创建第二个功能，数组增容-存疑
	private void addMaxBook() {
		/*System.out.println("-----------------------------------添加图书上限-------------------------------------");
		System.out.println();
		
		System.out.print("请输入您想扩展的上限");
		int number = BMUtility.readInt();
		BookList.addMaxBook(number);
	}*/
		System.out.println("暂不可用，敬请期待，相关功能已合并到功能1.自动扩容");
	
	}
	
	//创建功能3，修改图书信息
	private void modifyBook() {
		System.out.print("请选择待修改图书编号（-1退出）:");
		int number2 = BMUtility.readInt();
		if(number2 < -1 || number2 > bookList.getAllBooks().length ) {//判断用户所输入数字是否超过范围
			System.out.println("输入错误，请重新输入");
			return;
		}
		if (number2 == -1) {
			return;
		}
		number2 -= 1;
		
		Book[] books = bookList.getAllBooks();
		
		System.out.print("书名(" + books[number2].getName() + ")"+"<直接回车表示不修改>:");
		String m1 = BMUtility.readString(100, books[number2].getName());
		books[number2].setName(m1);
		
		System.out.print("作者名(" + books[number2].getAuthor() + ")");
		String m2 = BMUtility.readString(100, books[number2].getAuthor());
		books[number2].setAuthor(m2);
		
		System.out.print("售价(" + books[number2].getPrice() + ")");
		int m3 = BMUtility.readInt(books[number2].getPrice());
		books[number2].setPrice(m3);
		
		System.out.print("库存量(" + books[number2].getStock() + ")");
		int m4 = BMUtility.readInt(books[number2].getStock());
		books[number2].setStock(m4);
		
		System.out.print("售价(" + books[number2].getSales() + ")");
		int m5 = BMUtility.readInt(books[number2].getSales());
		books[number2].setSales(m5);
	}
	
	//创建功能4，删除图书
	private void deleteBook() {
		System.out.println("-------------------------------------删除图书---------------------------------------");
		System.out.println();
		System.out.print("请选择删除图书编号（-1退出）:");
		int number1 = BMUtility.readInt();
		
		if(number1 < -1 || number1 > bookList.getAllBooks().length ) {//判断用户所输入数字是否超过范围
			System.out.println("输入错误，请重新输入");
			return;
		}
		if (number1 == -1) {
			return;
		}
		System.out.print("确认是否删除（Y/N）：" );
		char n3 = BMUtility.readConfirmSelection();
		if(n3 == 'Y'){	
			boolean flag = bookList.deleteBook(number1 - 1);
			if(flag) {
			System.out.println("-------------------------------------删除完成---------------------------------------");
		}else {
			System.out.println("-------------------------------------删除失败---------------------------------------");
			return;
		}
		}	
		
	}
	
	//创建功能5，图书列表
	private void listBook() {
		System.out.println("-------------------------------------图书列表---------------------------------------");
		System.out.println("编号\t书名\t作者名\t售价\t库存量\t销售量");
		Book[] books = bookList.getAllBooks();
		for (int i = 0; i < bookList.getAllBooks().length; i++) {
			if(books[i] != null) {
				System.out.println((i+1) + "\t" + books[i].showDetails());
			}else {
				System.out.println("---------------------------------当前数据库中无内容----------------------------------");
				System.out.println();
			}
			
		}
	}
}
