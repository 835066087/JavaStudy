package myday10_TEST;

public class NotePad extends Computer {
	
	String weiXing;
	
	public NotePad() {//子类无参
		
	}
	
	public NotePad(String cpu,String memory,String harddisk,double price,String weiXing) {//子类全参
		super(cpu,memory,harddisk,price);
		this.weiXing = weiXing;
	}
	
	public String daoHang() {
		return   "在用" + weiXing + "做导航";
	}
	
	@Override //注解：一种特殊的注释，注释可以被JVM和编译器识别,@Override注解的作用是告诉编译器，
	//帮助我们作方法覆盖的条件的检查，如果条件不满足,则报错
	public String getDetails() {
		return super.getDetails() + "，卫星:" + weiXing;
	}
	

}
