package myday10_TEST;

public class Computer {

	private String cpu;
	private String memory;
	private String harddisk;
	private double price;
	
	public Computer() {//父类无参
		
	}
	
	public Computer(String cpu,String memory,String harddisk,double price) {//父类全参
		this.cpu = cpu;
		this.memory = memory;
		this.harddisk =harddisk;
		this.price = price;
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDetails() {
		return"CPU:" + cpu + ".内存:" + memory + ",硬盘:" + harddisk +",价格:" + price;
	}
}
