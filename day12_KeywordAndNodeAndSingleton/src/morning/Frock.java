package morning;

public class Frock {

	//静态的都放在最上面，隶属于类
	
	public static final int INCREMENT = 100;//全局常量，任意位置处只要通过类名.常量名即可访问
	
	private String size;
	private String color;
	private double price;
	private static int currentNum = 100000;
	private int serialNumber;
	
	//private final int SERIALNUMBER; 空final量必须尽快赋值
	
	//public int getSERIALNUMBER() {
	//	return SERIALNUMBER;
	//}
	
	//public void setSERIALNUMBER(int SERIALNUMBER) {
	//	this.SERIALNUMBER = SERIALNUMBER;
	//}

	static {
		currentNum = 150000;
	}
	
	{//在创建对象时执行仅有的一次，先于构造器执行,无论调用哪个构造器都无条件执行
		System.out.println("非静态语句块");//也可以有多个
	}

	
	public int getSerialNumber() {
		return serialNumber;
	}

//	public void setSerialNumber(int serialNumber) { 不需要set方法
//		this.serialNumber = getNextNum();
//	}

	public Frock() {
		super();
	//	this.SERIALNUMBER = getSERIALNUMBER();
	}

	public Frock(String size, String color, double price) {//实参和形参要匹配，虽然下面有this.serialNumber，但上方已经不需要了）
		super();
		//this.SERIALNUMBER = getSERIALNUMBER();
		this.serialNumber = getNextNum();
		this.size = size;
		this.color = color;
		this.price = price;
		System.out.println("构造器");
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getNextNum() {
		currentNum += INCREMENT;//提高可读性，提高扩展性
		return currentNum;

	}

	@Override
	public String toString() {
		return "编码：" + serialNumber + ",尺寸：" + size + ",颜色：" + color + ",价格：" + price;
	}

}
