package com.atguigu.service;

import com.atguigu.bmsre.domian.Book;

public class BookList {

	private Book[] books;// 用来保存书籍的数组
	private int realCount = 0;// 记录已保存的书籍数量

	public BookList(int totalCount) {
		this.books = new Book[totalCount];
	}

	// 增加新书籍功能
	public void addNewBook(Book book) {
		if (realCount != books.length - 1) {// 当书籍数组还有一格就将达到上限时，自动扩容
			this.books[realCount++] = book;
		} else {
			Book[] newBook = new Book[books.length * 3 / 2];// 扩容后遍历赋值数组
			for (int i = 0; i < books.length; i++) {
				newBook[i] = this.books[i];
			}
			books = newBook;
		}
	}

	// 获取制定书籍功能，用以修改图书
	public Book getBook(int index) {
		if (index < 0 || index > realCount - 1) {// 进行条件判断，防止用户输入非法数字
			System.out.println("输入错误");
			return null;
		}
		return books[index];
	}

	// 删除书籍功能
	public boolean deleteBook(int index) {
		if (index < 0 || index > realCount - 1) {// 进行条件判断，防止用户输入非法数字
			System.out.println("输入错误");
			return false;
		}
		books[index] = null;// 事实上这一步可以简化，因为在赋值的过程中，他被自然地覆盖了
		for (int i = index; i < realCount - 1; i++) {
			books[i] = books[i + 1];
			books[realCount--] = null;// 简化步骤，先运算，再赋值
		}
		return true;
	}

	// 获取书籍列表功能
	public Book[] getAllBooks() {
		Book[] tmp = new Book[realCount];//遍历数组并打印
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = this.books[i];
		}
		return tmp;
	}
}
