package com.gtguigu.bmsre.view;

import com.atguigu.bmsre.domian.Book;
import com.atguigu.service.BookList;
import com.gtguigu.bmsre.view.BMUtility;

public class BookView {

	// 对象关联
	BookList bookList = new BookList(10);

	public void enterMainMenu() {
		// 构筑循环条件
		boolean loop = true;

		do {
			System.out.println("------------------------------------图书信息管理系统---------------------------------");
			System.out.println();
			System.out.println("\t\t\t1 添加图书");
			System.out.println("\t\t\t2 修改图书");
			System.out.println("\t\t\t3 删除图书");
			System.out.println("\t\t\t4 图书列表");
			System.out.println("\t\t\t5 退   出");
			System.out.println();
			System.out.print("\t\t\t请选择（1-5）：");

			char yon = BMUtility.readMenuSelection();

			switch (yon) {
			case '1':
				addNewBook();
				break;

			case '2':
				modifyBook();
				break;

			case '3':
				deleteBook();
				break;

			case '4':
				listBook();
				break;

			case '5':
				System.out.print("确认是否退出（Y/N）：");
				char yon1 = BMUtility.readConfirmSelection();
				if (yon1 == 'Y') {
					loop = false;
				}
				break;

			}
		} while (loop = true);

	}

	// 创建第一个功能，引用List中的addNewBook方法
	private void addNewBook() {
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
		int sales = BMUtility.readInt();

		// 创建对象
		Book books = new Book(name, author, price, stock, sales);

		// 将对象置入数组
		bookList.addNewBook(books);

		System.out.println("-------------------------------------操作成功---------------------------------------");

	}

	// 创建第二个功能，修改图书信息
	private void modifyBook() {
		System.out.println("请选择待修改图书编号（-1退出）:");
		int number1 = BMUtility.readInt();
		if (number1 < -1 || number1 > bookList.getAllBooks().length) {
			System.out.println("输出错误，请重新输入");
			return;
		}
		if (number1 == -1) {
			return;
		}
		number1 -= 1;// 因为number实际上是在脚标上+1的，所以这里-1

		// 此处获取
		Book[] books = bookList.getAllBooks();

		System.out.print("书名(" + books[number1].getName() + ")" + "<直接回车表示不修改>:");
		String m1 = BMUtility.readString(100, books[number1].getName());// 此处即不输入就使用默认值
		books[number1].setName(m1);

		System.out.print("作者名(" + books[number1].getAuthor() + ")");
		String m2 = BMUtility.readString(100, books[number1].getAuthor());
		books[number1].setAuthor(m2);

		System.out.print("售价(" + books[number1].getPrice() + ")");
		int m3 = BMUtility.readInt(books[number1].getPrice());
		books[number1].setPrice(m3);

		System.out.print("库存量(" + books[number1].getStock() + ")");
		int m4 = BMUtility.readInt(books[number1].getStock());
		books[number1].setStock(m4);

		System.out.print("售价(" + books[number1].getSales() + ")");
		int m5 = BMUtility.readInt(books[number1].getSales());
		books[number1].setSales(m5);
	}

	// 创建功能3，删除图书
	private void deleteBook() {
		System.out.println("-------------------------------------删除图书---------------------------------------");
		System.out.println();
		System.out.print("请选择删除图书编号（-1退出）:");
		int number2 = BMUtility.readInt();

		if (number2 < -1 || number2 > bookList.getAllBooks().length) {// 判断用户所输入数字是否超过范围
			System.out.println("输入错误，请重新输入");
			return;
		}
		if (number2 == -1) {// -1提出键位
			return;
		}
		System.out.print("确认是否删除（Y/N）：");
		char n3 = BMUtility.readConfirmSelection();
		if (n3 == 'Y') {
			boolean flag = bookList.deleteBook(number2 - 1);
			if (flag) {
				System.out.println("-------------------------------------删除完成---------------------------------------");
			} else {
				System.out.println("-------------------------------------删除失败---------------------------------------");
				return;
			}
		}
	}

	// 创建功能4，图书列表
	private void listBook() {
		System.out.println("-------------------------------------图书列表---------------------------------------");
		System.out.println("编号\t书名\t作者名\t售价\t库存量\t销售量");
		Book[] books = bookList.getAllBooks();
		for (int i = 0; i < bookList.getAllBooks().length; i++) {
			if (books[i] != null) {
				System.out.println((i + 1) + "\t" + books[i].showDetails());// 此处最先的i+1表编号
			} else {
				System.out.println("---------------------------------当前数据库中无内容----------------------------------");
				System.out.println();
			}
		}
	}
}
