package com.atguigu.service;

import com.atguigu.cms.domain.Book;

public class BookList {
	
	private Book[] books;//用来保存书籍的数组
	private int realCount = 0;//记录已保存的书籍数量
	
	public BookList(int totalCount) {
		this.books = new Book[totalCount];//创建数组对象
	}
	
	//增加新书籍功能
	public void addNewBook(Book book) {
		//扩容与增加新书籍功能重合
		  if(realCount != books.length - 1){
				this.books[realCount ++] = book;
		 	 	} else {
		 	 	Book[] newBook = new Book[this.books.length + 50];//一次在原有基础上扩容50的上限
		 	 	for (int i = 0; i < books.length; i++) {
		 	 		newBook[i] = this.books[i];
		 	 	} 
		 	 	books = newBook;
		 	 }
	}
	
	//单独扩容功能(扩容功能可与增加新书籍功能重合，即加上if条件判断，在旧数组达到上限时，自动增加上限）
	/*public Book[] addMaxBook(int number) {
		Book[] newBook = new Book[ books.length + number];//原有基础上扩容
		for (int i = 0; i < newBook.length; i++) {
			newBook[i] = books[i];
		}
		books = newBook;
		return books;
	}*/
	
	//获取单一书籍信息功能
	public Book getBook(int index) {
		if(index < 0 || index > realCount) {
			System.out.println("输入错误");
			return null;
		}
		return books[index];
	}
	
	//删除书籍功能
	public boolean deleteBook(int index) {
		if(index < 0 || index > realCount) {
			System.out.println("输入错误");
			return false;
		}
		books[index] = null;
		for(int i = index; i < realCount - 1; i++) {
			books[i]=books[i+1];
			books[realCount --] = null;//简化步骤，先运算，再赋值
		}
		return true;
	}
	
	//获取书籍列表功能
	public Book[] getAllBooks() {
		Book[] tmp = new Book[realCount];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = this.books[i];
		}
		return tmp;
	}
	
	
}
