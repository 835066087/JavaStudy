package day01_sum;

/*
 * 
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
   你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 
 * 
 */

public class sum {

	//自作
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int[] error = {-1,-1};//为了报错
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {//防止j和i重复
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		if(result[0] == 0 && result[1] == 0) {//报错情况
			return error;
		}else {
			return result;
		}
	}
	
	//答案
	public int[] twoSum1(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    
	    String str = "sss";
	    str.toString();
	    throw new IllegalArgumentException("No two sum solution");
	}
	

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int[] nums1 = { 1, 23, 4, 5, 6 };
		int[] result = twoSum(nums, 9);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		int[] result1 = twoSum(nums1, 27);
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}

	}
}
