package day06;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		char[] chArr = new char[26];
		for(int i = 0; i < chArr.length;i++) {
			chArr[i] = (char)('A' + i);
		}
		for(int i = 0; i < chArr.length;i++) {
			System.out.print(chArr[i]+" ");
		}
		
		char[] chArr1 = new char[36];
		for(int i = 0; i < 26;i++) {
			chArr1[i] = (char)('A' + i);
		}
		
		for(int i = 26; i < 36; i++) {
			chArr1[i]= (char) ('0' + i - 26);
			System.out.print(chArr1[i] + " ");
		}
		
	}
	
	public static void main2(String[] args) {
	
		int[] day = new int[6];
		day[0] = 1996;
		day[1] = 5;
		day[2] = 18;
		day[3] = 2019;
		day[4] = 3;
		day[5] = 22;
	
		System.out.println("生日是" + day[0] + "年" + day[1] + "月" + day[2] + "日");
		System.out.println("今天是" + day[3] + "年" + day[4] + "月" + day[5] + "日");

	}
	
}
