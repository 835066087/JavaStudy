package ArrayTest;

//注：基本数据类型统一为arr，引用数据类型统一为arr1

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 3, 4, 55, 22, 11, 123 };
		int[] newArr = bubbleSort(arr);
		for (int tmp : newArr) {
			System.out.print(tmp + " ");
		}
	}

	// 一、容量减半
	// 1.基本数据类型
	public static int[] halveArr(int arr[]) {
		int[] newArr = new int[arr.length / 2];// 创建容量为老数组一半的新数组
		for (int i = 0; i < newArr.length; i++) {// 遍历把老数组中需要的数据复制到新数组中
			newArr[i] = arr[i];
		}
		arr = newArr;// 老引用指向新数组
		return arr;
	}

	// 2.引用数据类型无法做成工具类，因为引用数据类型其中的数据个数不确定

	// 二、翻转
	// 1.基本数据类型
	public static int[] overTurnArr(int arr[]) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}

		return newArr;
	}

	// 三、取子数组，此处因未知子数组条件，因而以偶数为例
	// 1.基本数据类型
	public static int[] getChildArr(int arr[]) {
		int[] newArr = new int[arr.length];
		int count = 0;// 利用count作为脚标
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {// 在此处进行条件判断，条件随时可以改变
				newArr[count] = arr[i];
				count++;
			} else {
				continue;
			}
		}
		int[] newArr1 = new int[count];// 构造完美数组
		for (int i = 0; i < newArr1.length; i++) {
			newArr1[i] = newArr[i];
		}
		return newArr1;
	}

	// 四、选择排序
	public static int[] selectSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {// 以i为基准位置, 基准位置就是用于保存从此位置到后面中的所有数的最小值
			int minIndex = i;// 假设基准位置的值最小
			for (int j = i + 1; j < arr.length; j++) {// 尝试从后面中的所有数再次比较找出真正最小值的下标
				// 找最小值下标
				if (arr[j] < arr[minIndex]) {
					minIndex = j;// 保存下标
				}
			}
			// minIndex中保存的就是从基准位置到最后中的所有数中的最小值的下标
			// 此时,基准位置中就可以保存最小值了, 交换基准位置和最小值下标处的值
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}

		return arr;
	}

	// 五、冒泡排序
	public static int[] bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}
}
