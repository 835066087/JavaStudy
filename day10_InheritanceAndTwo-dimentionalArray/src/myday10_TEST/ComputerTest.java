package myday10_TEST;

import java.util.Arrays;

public class ComputerTest {
	public static void test1 (Computer computer) {
		computer.getDetails();
	
		if (computer instanceof NotePad) {
			NotePad np11 =  (NotePad)computer;
			System.out.println(np11.daoHang());
		}else if (computer instanceof PC) {
			System.out.println(((PC)computer).code());
		}else {
			System.out.println("不知道啥电脑");
		}
	}
	
	public static void listPrice(Computer computer) {
		System.out.println(computer.getPrice());
		
		if(computer instanceof NotePad) {
			System.out.println(((NotePad)computer).daoHang());
		}else if(computer instanceof PC) {
			System.out.println(((PC)computer).code());
		}else {
			System.out.println("你这是啥电脑啊");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		/*
		 * PC pc = new PC(); pc.setCpu("i7"); pc.setMemory( "16G");
		 * pc.setHarddisk("256G");
		 * 
		 * System.out.println(pc.getCpu()); System.out.println(pc.getMemory());
		 * System.out.println(pc.getHarddisk());
		 * 
		 * pc.keyboard = "Cherry键盘";
		 * 
		 * System.out.println(pc.getDetails());
		 * 
		 * System.out.println(pc.code());
		 * 
		 * NotePad p1 = new NotePad(); p1.setCpu("i7"); p1.setMemory("8G");
		 * p1.setHarddisk("128G");
		 * 
		 * System.out.println(p1.getCpu()); System.out.println(p1.getMemory());
		 * System.out.println(p1.getHarddisk());
		 * 
		 * p1.weiXing = "可能是第一百号卫星";
		 * 
		 * System.out.println(p1.getDetails());
		 * 
		 * 
		 * System.out.println(p1.daoHang());
		 */
		Computer[] arr = new Computer[5];
		Computer np2 = new NotePad("i7", "8G", "128G",5000, "可能是第二百号卫星");// 全参构造器构造
		Computer pc1 = new PC("i7", "8G", "128G",4000, "不知道什么键盘");// 全参构造器构造
		Computer np1 = new NotePad("i5","4G","64G",3000,"可能没有卫星");
		Computer pc2 = new Computer("i3", "16G", "128G",1000);
		Computer pc3 = new PC("i7", "8G", "256G",2000, "随便一键盘");
		
		arr[0] = np2;
		arr[1] = np1;
		arr[2] = pc2;
		arr[3] = pc3;
		arr[4] = pc1;
		
		//冒泡排序，思路，从左到右，依次比较，左右两个数不断交换位置，从而达成排序的目的
		/*for(int i = 0; i < arr.length - 1 ; i++) {//因为第一次交换，最右侧一定是最大数，因而只用length-1次就可以交换完成
			for(int j = 0; j < arr.length - 1 - i; j ++) {//基于同样的原因，内圈可以-i，简化运算过程
				if(arr[j].getPrice() > arr[j + 1].getPrice()){
					Computer tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = tmp;
				}
			}
		}*/
		
		//选择排序，以位置为出发点，从0开始处理基准位置
		//以i为基准位置，基准位置就是用于保护从此位置直到后面中的所有数的最小值
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length ; j++) {
				//找最小值下标 
				if(arr[j].getPrice() < arr[minIndex].getPrice()) {
					minIndex = j;
				}
			
			Computer tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
			}
		}
		
		//Arrays.parallelSort(arr);
		
		for(Computer n : arr) {
			System.out.println(n.getDetails() + " ");
		}
			System.out.println();
			
			System.out.println();
			
			test1(pc1);
			
			System.out.println("*****************************************");
			
			listPrice(np1);
			
	}
}
