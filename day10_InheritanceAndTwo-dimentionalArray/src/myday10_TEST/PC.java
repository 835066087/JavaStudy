package myday10_TEST;

public class PC extends Computer {
	String keyboard;
	
	public PC() {
		
	}
	
	public PC(String cpu,String memory,String harddisk,double price,String keyboard) {
		super(cpu,memory,harddisk,price);
		this.keyboard = keyboard;
	}
	
	public String code() {
		return "在用" + keyboard + "写代码";
	}
	
	@Override//首字母大写说明是个特殊类
	public String getDetails() {
		return super.getDetails() + "，键盘：" + keyboard;
	
	}
}
