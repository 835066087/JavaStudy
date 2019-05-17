package com.atguigu.cms.domain;

public class Book {

	private String name;//书名
	private String author;//作者
	private int price;//价格
	private int stock;//存量
	private int sales;//销量
	
	public Book() {//无参构造器
		
	}
	
	public Book(String name, String author, int price, int stock, int sales) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.stock = stock;
		this.sales = sales;
		
	}
	
	
	public String getName() {
		return name;
	}  
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getSales() {
		return sales;
	}
	
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public String showDetails() {
		String str = name + "\t" + author + "\t" + price + "\t" + stock + "\t" + sales;
		return str;
	}
	
	
	
	
}
