
public class DoubleArray {

	public static void main(String[] args) {
		int[][] doubleArray = new int [3][];
		doubleArray[0] = new int [4];
		doubleArray[1] = new int [2];
		doubleArray[2] = new int [5];

		for(int i = 0; i < doubleArray.length; i++) {
			int[] child = doubleArray[i];
			for(int j = 0; j < child.length; j++) {
				child[j] =  10 * (i + 1) + j + 1;
			}
		}
		
		//求平均值
		int sum = 0;
		int count = 0;
		for(int i = 0; i <doubleArray.length;i++) {
			for(int j = 0 ; j < doubleArray[i].length; j++) {
				sum += doubleArray[i][j];
			}
			count += doubleArray.length;
			
		}
		int avg = sum/count;
		System.out.println("avg:" + avg);
		
		//练习：使用静态方式创建多维数组，保存生日
		//今天扥时间，年月日，时分秒
		//
		
		int[][] arr = new int[][] {{1996,5,18},{2019,3,26,11,14,30},{1995,11,26}};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + "年" + arr[i][1] + "月" +arr[i][2] + "日");
			if(arr[i].length == 6) {
				System.out.println(arr[i][3] + "时" + arr[i][4] + "分" + arr[i][5] + "秒");
			}
			}
		int sum11 = 0;
		for(int[] child : arr) {
			for(int n : child) {
				sum11  += n;
			}
		}
		
		System.out.println("sum:" + sum11);
		
		
		
	}
}
